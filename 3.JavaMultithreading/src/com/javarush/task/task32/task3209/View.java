package com.javarush.task.task32.task3209;

import com.javarush.task.task32.task3209.listeners.FrameListener;
import com.javarush.task.task32.task3209.listeners.TabbedPaneChangeListener;
import com.javarush.task.task32.task3209.listeners.UndoListener;

import javax.swing.*;
import javax.swing.undo.UndoManager;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class View extends JFrame implements ActionListener {
    private Controller controller;
    private JTabbedPane tabbedPane = new JTabbedPane();
    private JTextPane htmlTextPane = new JTextPane();
    private JEditorPane plainTextPane = new JEditorPane();
    private UndoManager undoManager = new UndoManager();
    private UndoListener undoListener = new UndoListener(undoManager);

    public View () {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());

        } catch (Exception e) {
            ExceptionHandler.log(e);
        }
    }

    public Controller getController() {
        return controller;
    }

    public void setController(Controller controller) {
        this.controller = controller;
    }


    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        switch (actionEvent.getActionCommand()){
            case "Новый" : controller.createNewDocument();
            break;
            case "Открыть" : controller.openDocument();
            break;
            case "Сохранить" : controller.saveDocument();
            break;
            case "Сохранить как..." : controller.saveDocumentAs();
            break;
            case "Выход" : controller.exit();
            break;
            case "О программе" : showAbout();
            break;
        }
    }


    public void init() {
        initGui();
        addWindowListener(new FrameListener(this));
        setVisible(true);
    }

    public void initMenuBar(){
        JMenuBar bar = new JMenuBar();
        MenuHelper.initFileMenu(this ,bar);
        MenuHelper.initEditMenu(this ,bar);
        MenuHelper.initStyleMenu(this ,bar);
        MenuHelper.initAlignMenu(this ,bar);
        MenuHelper.initColorMenu(this ,bar);
        MenuHelper.initFontMenu(this ,bar);
        MenuHelper.initHelpMenu(this ,bar);

        getContentPane().add(bar , BorderLayout.NORTH);
    }

    public void initEditor(){
        htmlTextPane.setContentType("text/html");
        tabbedPane.add("HTML" , new JScrollPane(htmlTextPane));
        tabbedPane.add("Текст" , new JScrollPane(plainTextPane));
        tabbedPane.setPreferredSize(new Dimension());
        tabbedPane.addChangeListener(new TabbedPaneChangeListener(this));
        getContentPane().add(tabbedPane , BorderLayout.CENTER);

    }

    public void initGui() {
        initMenuBar();
        initEditor();
        pack();
    }

    public void selectedTabChanged(){
        if(tabbedPane.getSelectedIndex() == 0){
            controller.setPlainText(plainTextPane.getText());
        }else {
            plainTextPane.setText(controller.getPlainText());
        }
        resetUndo();
    }

    public void exit(){
        controller.exit();
    }

    public boolean canUndo (){
        return undoManager.canUndo();
    }
    public boolean canRedo (){
        return undoManager.canRedo();
    }

    public void undo(){
        try {
            undoManager.undo();
        } catch (Exception e) {
            ExceptionHandler.log(e);
        }
    }

    public void redo(){
        try {
            undoManager.redo();
        } catch (Exception e) {
            ExceptionHandler.log(e);
        }
    }

    public boolean isHtmlTabSelected(){
        return tabbedPane.getSelectedIndex() == 0;
    }

    public void selectHtmlTab(){
        tabbedPane.setSelectedIndex(0);
        resetUndo();
    }

    public void resetUndo(){
        undoManager.discardAllEdits();
    }

    public UndoListener getUndoListener() {
        return undoListener;
    }


    public void update(){
       htmlTextPane.setDocument( controller.getDocument());
    }

    public void showAbout() {
        JOptionPane.showMessageDialog(getContentPane(), "Version 1.0", "About", JOptionPane.INFORMATION_MESSAGE);
    }
}
