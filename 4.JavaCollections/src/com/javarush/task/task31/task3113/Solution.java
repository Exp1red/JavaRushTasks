package com.javarush.task.task31.task3113;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

/* 
Что внутри папки?
*/
public class Solution {
    static int countOfDir;
    static int countOfFile;
    static long sizeOfALlFiles;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Path path = Paths.get(reader.readLine());
        if (!Files.isDirectory(path)) {
            System.out.println(path.toAbsolutePath() + " - не папка");
            return;
        }


        Files.walkFileTree(path, new MyFileVisitor());

        System.out.println("Всего папок - " + (countOfDir - 1));
        System.out.println("Всего файлов - " + countOfFile);
        System.out.println("Общий размер - " + sizeOfALlFiles);

    }

    public static class MyFileVisitor extends SimpleFileVisitor<Path> {

        @Override
        public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
            if (attrs.isDirectory()) {
                countOfDir++;
            }
            return FileVisitResult.CONTINUE;
        }

        @Override
        public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
            if (attrs.isRegularFile()) {
                countOfFile++;
            }

            sizeOfALlFiles += attrs.size();
            return FileVisitResult.CONTINUE;
        }
    }

}
