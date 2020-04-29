package com.javarush.task.task18.task1808;

/* 
Разделение файла
Считать с консоли три имени файла: файл1, файл2, файл3.
Разделить файл1 по следующему критерию:
Первую половину байт записать в файл2, вторую половину байт записать в файл3.
Если в файл1 количество байт нечетное, то файл2 должен содержать большую часть.
Закрыть потокi
*/

import java.io.*;
import java.util.ArrayList;

//public class Solution {
//    public static void main(String[] args) throws IOException {
//        FileInputStream file1 = new FileInputStream(new BufferedReader(new InputStreamReader(System.in)).readLine());
//        FileOutputStream file2 = new FileOutputStream(new BufferedReader(new InputStreamReader(System.in)).readLine());
//        FileOutputStream file3 = new FileOutputStream(new BufferedReader(new InputStreamReader(System.in)).readLine());
//        ArrayList<Byte> list = new ArrayList<>();
//        int index ;
//        while (file1.available() > 0){
//        list.add((byte)file1.read());
//        }
//        if  (list.size()%2 == 0){
//            index = list.size()/2;
//        }else {
//            index = list.size()/2+1;
//        }
//        for (int i = 0; i < list.size() ; i++ ) {
//            if (i<=index) {
//                file2.write(list.get(i));
//            }else {
//                file3.write(list.get(i));
//            }
//        }
//        int maxIndex = file1.available();
//        if (file1.available() %2 == 0 ) {
//            index = file1.available()/2;
//        }else {
//            index = ((int) file1.available()/2)+1;
//        }
//        while(file1.available()>0){
//          for (int i = 0 ; i <maxIndex; i++) {
//             if(i <= index ){
//                 file2.write(file1.read());
//             }else {
//                 file3.write(file1.read());
//             }
//          }
//        }
//
//        file1.close();
//        file2.close();
//        file3.close();
//    }
//}
import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream in = new FileInputStream(new File(reader.readLine()));
        FileOutputStream out2 = new FileOutputStream(new File(reader.readLine()));
        FileOutputStream out3 = new FileOutputStream(new File(reader.readLine()));



        while(in.available() > 0){
            if(in.available() % 2 == 0){
                byte[] o1 = new byte[in.available()/2];
                byte[] o2 = new byte[in.available()/2];
                int count1 = in.read(o1);
                int count2 = in.read(o2);
                out2.write(o1, 0, count1);
                out3.write(o2, 0, count2);
            } else {
                byte[] o1 = new byte[in.available()/2 + 1];
                byte[] o2 = new byte[in.available()/2];
                int count1 = in.read(o1);
                int count2 = in.read(o2);
                out2.write(o1, 0, count1);
                out3.write(o2, 0, count2);
            }
        }

        reader.close();
        in.close();
        out2.close();
        out3.close();
    }
}
/*
public static void main(String[] args) throws IOException
{
 //кладем данные в строку
 StringBuilder sb = new StringBuilder();
 sb.append("Lena").append('\n');
 sb.append("Olya").append('\n');
 sb.append("Anya").append('\n');
 String data = sb.toString();

 //Оборачиваем строку в класс ByteArrayInputStream
 InputStream is = new ByteArrayInputStream(data.getBytes());

 //подменяем in
 System.setIn(is);

 //вызываем обычный метод, который не подозревает о наших манипуляциях
 readAndPrintLine();
}

public static void readAndPrintLine() throws IOException
{
 InputStreamReader isr = new InputStreamReader(System.in);
 BufferedReader reader = new BufferedReader(isr);

 while (true)
 {
  String line = reader.readLine();
  if (line == null) break;
  System.out.println(line);
 }
 reader.close();
 isr.close();
}
 */