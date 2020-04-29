package com.javarush.task.task30.task3008.client;

import com.javarush.task.task30.task3008.Connection;
import com.javarush.task.task30.task3008.ConsoleHelper;
import com.javarush.task.task30.task3008.Message;
import com.javarush.task.task30.task3008.MessageType;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Client {
    protected Connection connection;
    private volatile boolean clientConnected = false;

    public static void main(String[] args) {
       new Client().run();
    }

    public  void run(){
      SocketThread thread = getSocketThread();
      thread.setDaemon(true);
      thread.start();

      synchronized (this) {
          try {
              this.wait();
          } catch (InterruptedException e) {
              ConsoleHelper.writeMessage("Ошибка на стороне клиента.");
          }
      }

          if (clientConnected) {
              ConsoleHelper.writeMessage("Соединение установлено. Для выхода наберите команду 'exit'.");

             while (clientConnected) {
                 String message = ConsoleHelper.readString();
                 if (message.equals("exit")) {
                     break;
                 }else if (shouldSendTextFromConsole()){
                     sendTextMessage(message);
                 }
             }

          }else ConsoleHelper.writeMessage("Произошла ошибка во время работы клиента.");

    }

    protected String getServerAddress(){
        return ConsoleHelper.readString();
    }

    protected int getServerPort(){
        return ConsoleHelper.readInt();
    }

    protected String getUserName()  {
        return ConsoleHelper.readString();
    }

    protected boolean shouldSendTextFromConsole(){
        return true;
    }

    protected SocketThread getSocketThread(){
        return new SocketThread();
    }

    protected void sendTextMessage(String text){
        try {
            connection.send(new Message(MessageType.TEXT , text));
        } catch (IOException e) {
            ConsoleHelper.writeMessage("Ошибка передачи данных.");
            clientConnected = false;
        }
    }


    public class SocketThread extends Thread{

        public void run() {
            try {
                Socket socket = new Socket(getServerAddress() , getServerPort());
                 connection = new Connection(socket);
                clientHandshake();
                clientMainLoop();

            } catch (IOException | ClassNotFoundException e) {
                notifyConnectionStatusChanged(false);
            }

        }



        protected void clientHandshake() throws IOException, ClassNotFoundException {
           while (true){
               Message message = connection.receive();
               if (message.getType() == null){
                   throw new IOException("Unexpected MessageType");
               }
               if (message.getType().equals(MessageType.NAME_REQUEST)){
                   connection.send(new Message(MessageType.USER_NAME , getUserName()));
               }else if (message.getType().equals(MessageType.NAME_ACCEPTED)){
                   notifyConnectionStatusChanged(true);
                   break;
               }else {
                   throw new IOException("Unexpected MessageType");
               }
           }
        }


        protected void clientMainLoop() throws IOException, ClassNotFoundException {
           while (true){
              Message message =  connection.receive();
              if (message.getType() == null){
                  throw new IOException("Unexpected MessageType");
              }
              if (message.getType().equals(MessageType.TEXT)){
                  processIncomingMessage(message.getData());
              }else if (message.getType().equals(MessageType.USER_ADDED)){
                  informAboutAddingNewUser(message.getData());
              }else if (message.getType().equals(MessageType.USER_REMOVED)){
                  informAboutDeletingNewUser(message.getData());
              } else {
                  throw new IOException("Unexpected MessageType");
              }
           }
        }

        protected void processIncomingMessage(String message) {
            ConsoleHelper.writeMessage(message);
        }

        protected void informAboutAddingNewUser(String userName) {
            ConsoleHelper.writeMessage(userName+" присоединился к чату.");
        }

        protected  void informAboutDeletingNewUser(String userName){
            ConsoleHelper.writeMessage(userName+" покинул чат.");
        }

        protected void notifyConnectionStatusChanged(boolean clientConnected){
            Client.this.clientConnected = clientConnected;
                synchronized (Client.this) {
                    Client.this.notify();
                }
        }
    }

}
