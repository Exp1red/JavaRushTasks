package com.javarush.task.task32.task3209;

import javax.swing.*;
import javax.swing.text.html.HTMLDocument;
import javax.swing.text.html.HTMLEditorKit;
import java.io.*;

public class Controller {
    private View view;
    private HTMLDocument document;
    private File currentFile;

    public Controller(View view) {
        this.view = view;
    }

    public static void main(String[] args) {
        View view = new View();
        Controller controller = new Controller(view);
        view.setController(controller);
        view.init();
        controller.init();
    }


    public void exit(){
        System.exit(0);
    }

    public void init(){
        createNewDocument();
    }

    public HTMLDocument getDocument() {
        return document;
    }

    public void resetDocument(){
        if (document != null) {
            document.removeUndoableEditListener(view.getUndoListener());
        }
        document = (HTMLDocument) new HTMLEditorKit().createDefaultDocument();
        document.addUndoableEditListener(view.getUndoListener());
        view.update();
    }


    public void setPlainText(String text){
        try {
            resetDocument();
            new HTMLEditorKit().read( new StringReader(text), document , 0);
        }catch (Exception e){
            ExceptionHandler.log(e);
        }
    }

    public String getPlainText(){
        try {
            StringWriter stringWriter = new StringWriter();
            new HTMLEditorKit().write(stringWriter, document  , 0 , document.getLength());
            return stringWriter.toString();
        }catch (Exception e){
            ExceptionHandler.log(e);
            return null;
        }
    }

    public void createNewDocument(){
        view.selectHtmlTab();
        resetDocument();
        view.setTitle("HTML EDITOR");
        view.resetUndo();
        currentFile = null;

    }

    public void openDocument(){
        try {
            view.selectHtmlTab();
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setFileFilter(new HTMLFileFilter());
            fileChooser.setDialogTitle("Open File");
            int result = fileChooser.showOpenDialog(view);

            if (result == 0) {

                currentFile = fileChooser.getSelectedFile();
                resetDocument();
                view.setTitle(currentFile.getName());

                FileReader reader = new FileReader(currentFile);
                new HTMLEditorKit().read(reader, document, 0);
                view.resetUndo();
                reader.close();
            }
        }catch (Exception e){
            ExceptionHandler.log(e);
        }
    }

    public void saveDocument(){
        try {
            if (currentFile == null) {
                saveDocumentAs();
            } else {
                view.selectHtmlTab();
                FileWriter fileWriter = new FileWriter(currentFile);
                 new HTMLEditorKit().write(fileWriter, document, 0, document.getLength());
                fileWriter.close();
            }
        }catch (Exception e){
            ExceptionHandler.log(e);
        }
    }

    public void saveDocumentAs(){
        try {
        view.selectHtmlTab();
        JFileChooser fileChooser = new JFileChooser();
            fileChooser.setFileFilter(new HTMLFileFilter());

            if ( fileChooser.showSaveDialog(view) == JFileChooser.APPROVE_OPTION ){
                currentFile = fileChooser.getSelectedFile();
                view.setTitle(currentFile.getName());
                FileWriter fileWriter = new FileWriter(currentFile);
                new HTMLEditorKit().write(fileWriter ,document , 0 , document.getLength());
                fileWriter.close();
            }
        } catch (Exception e) {
            ExceptionHandler.log(e);
        }
    }

}

