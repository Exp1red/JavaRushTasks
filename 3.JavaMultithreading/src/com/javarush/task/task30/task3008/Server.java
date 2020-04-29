package com.javarush.task.task30.task3008;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Server {

    private static Map<String, Connection> connectionMap = new ConcurrentHashMap<>();

    public static void main(String[] args) {

        int port = ConsoleHelper.readInt();
        try (ServerSocket serverSocket = new ServerSocket(port)){
            ConsoleHelper.writeMessage("Сервер запущен.");
            while (true) {
                Socket socket = serverSocket.accept();
                    new Handler(socket).start();
                }

        } catch (IOException ignored) {
            ConsoleHelper.writeMessage("Ошибка , сервер упал.");
        }
    }




    public static void sendBroadcastMessage(Message message){

        for (Connection connect : connectionMap.values()) {
            try {
                connect.send(message);
            } catch (IOException e) {
                ConsoleHelper.writeMessage("Не удалось отправить сообщение.");
            }
        }
    }
    private static class Handler extends Thread{
        private Socket socket;
        public Handler(Socket socket){
                this.socket = socket;
            }


        public void run() {

            ConsoleHelper.writeMessage("Было установлено соединение с удаленным адресом : " + socket.getRemoteSocketAddress());

            try (Connection connection = new Connection(socket)) {

                String userName = serverHandshake(connection);
                sendBroadcastMessage(new Message(MessageType.USER_ADDED , userName));
                notifyUsers(connection , userName);

                serverMainLoop(connection, userName);

                connectionMap.remove(userName);
                sendBroadcastMessage(new Message(MessageType.USER_REMOVED , userName));
                ConsoleHelper.writeMessage("Соединение с удаленным адресом закрыто.");

            } catch (IOException | ClassNotFoundException e) {
                ConsoleHelper.writeMessage("Произошла ошибка при обмене данными с удаленным адресом.");
            }

        }


        private String serverHandshake(Connection connection) throws IOException, ClassNotFoundException {
                Message message = new Message(MessageType.NAME_REQUEST , "Введите имя: ");
                connection.send(message);
                Message answer =  connection.receive();

                if (answer.getType().equals(MessageType.USER_NAME)) {
                    String userName = answer.getData();
                    if (!userName.isEmpty()) {

                        if (!connectionMap.containsKey(userName)) {
                            connectionMap.put(userName, connection);
                            connection.send(new Message(MessageType.NAME_ACCEPTED , "Вы добавлены в чат!"));
                            return userName;

                        } else return serverHandshake(connection);
                    }  else return serverHandshake(connection);
                }else return serverHandshake(connection);
            }


        private void notifyUsers(Connection connection, String userName) throws IOException{
            for (String name : connectionMap.keySet()){
                if (!name.equals(userName)) {
                    connection.send(new Message(MessageType.USER_ADDED, name));
                }
            }
        }

        private void serverMainLoop(Connection connection, String userName) throws IOException, ClassNotFoundException{

            while(true) {
                Message answer = connection.receive();

                if (answer.getType() == (MessageType.TEXT)) {
                    sendBroadcastMessage(new Message(MessageType.TEXT, userName + ": " + answer.getData()));
                } else {
                    ConsoleHelper.writeMessage("Сообщение не является текстом");
                }

            }

        }
    }
}




















