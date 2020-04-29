package com.javarush.task.task17.task1721;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Транзакционность
В методе joinData:
3. Если список allLines содержит все строки из forRemoveLines, то удалить из списка allLines все строки, которые есть в forRemoveLines.
4. Если условие из п.3 не выполнено, то:
4.1. очистить allLines от данных
4.2. выбросить исключение CorruptedDataException
Метод joinData должен вызываться в main. Все исключения обработайте в методе main.
Не забудь закрыть потоки.
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();



    public Solution() {
    }

    public static void main(String[] args) throws IOException {
        BufferedReader fileNameReader = new BufferedReader(new InputStreamReader(System.in));
        String line;
        Solution solution = new Solution();
        try {
            BufferedReader reader1 = new BufferedReader(new FileReader(fileNameReader.readLine()));
            BufferedReader reader2 = new BufferedReader(new FileReader(fileNameReader.readLine()));
            while ((line = reader1.readLine()) != null){
                allLines.add(line);
            }

            while ((line = reader2.readLine()) != null){
                forRemoveLines.add(line);
            }
            reader1.close();
            reader2.close();
            fileNameReader.close();
        }catch (IOException e){
            e.printStackTrace();
        }

        try {
            solution.joinData();
        }catch (CorruptedDataException e){
            e.printStackTrace();
        }
    }

    public  void joinData() throws CorruptedDataException {
       if(allLines.containsAll(forRemoveLines)){
        for (int i = 0; i < allLines.size() ; i++) {
            if (forRemoveLines.get(i).equals(allLines.get(i))) {
                allLines.remove(i);
            }
        }

        }else {
           allLines.clear();
           throw new CorruptedDataException();
       }

    }
}
