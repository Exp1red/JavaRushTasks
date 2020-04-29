package com.javarush.task.task18.task1823;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* 
Нити и байты
Читайте с консоли имена файлов, пока не будет введено слово "exit".
Передайте имя файла в нить ReadThread.
Нить ReadThread должна найти байт, который встречается в файле максимальное число раз, и добавить его в словарь resultMap,
где параметр String - это имя файла, параметр Integer - это искомый байт.
Закрыть потоки.
Требования:
1. Программа должна считывать имена файлов с консоли, пока не будет введено слово "exit".
2. Для каждого файла создай нить ReadThread и запусти ее.
3. После запуска каждая нить ReadThread должна создать свой поток для чтения из файла.
4. Затем нити должны найти максимально встречающийся байт в своем файле и добавить его в словарь resultMap.
5. Поток для чтения из файла в каждой нити должен быть закрыт.
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        while(true) {
            String fileName = reader.readLine();
            if (fileName.equals("exit")){
                break;
            }else {
                list.add(fileName);
            }
        }
        reader.close();

        for (String path: list) {
            new ReadThread(path).start();
        }

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(resultMap);
    }

    public static  class ReadThread extends Thread {
        String path;
        FileInputStream fileInputStream ;
        HashMap<Byte, Integer> map ;
        ArrayList<Byte> list ;


        public ReadThread(String fileName) throws FileNotFoundException {
            this.path = fileName;
            this.fileInputStream = new FileInputStream(path);
            this.map = new HashMap<>();
            this.list = new ArrayList<>();
        }


        public  void run() {
          try {
              while (fileInputStream.available() > 0) {
                  list.add((byte) fileInputStream.read());
              }
              for (int i = 0; i < list.size(); i++) {
                  int count = Collections.frequency(list, list.get(i));
                  this.map.put(list.get(i), count);
              }
              if (!map.isEmpty()) {
                  int max = Collections.max(map.values());
                  for (Map.Entry<Byte, Integer> pair : map.entrySet()) {
                      if (pair.getValue() == max) {
                          resultMap.put(path, (int)pair.getKey());
                      }
                  }
              }
          }catch (Exception e){
              e.printStackTrace();
          }
          finally {
              try {
                  fileInputStream.close();
              } catch (IOException e) {
                  e.printStackTrace();
              }
          }
        }
    }
}
