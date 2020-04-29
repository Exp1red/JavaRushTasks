package com.javarush.task.task26.task2608;

/* 
Мудрый человек думает раз, прежде чем два раза сказать
Все методы, кроме метода main, класса Solution должны быть thread safe.
Сделайте так, чтобы оба метода могли выполняться одновременно двумя различными тредами.
synchronized(this) для этого не подходит, используй другой объект для лока.
*/
public class Solution {
    int var1;
    int var2;
    int var3;
    int var4;

    static final Object lock1 = new Object();
    static final Object lock2 = new Object();

    public Solution(int var1, int var2, int var3, int var4) {
        this.var1 = var1;
        this.var2 = var2;
        this.var3 = var3;
        this.var4 = var4;
    }

    public  int  getSumOfVar1AndVar2() {
       synchronized (lock1) {
           return var1 + var2;
       }
    }

    public int getSumOfVar3AndVar4() {
        synchronized (lock2) {
            return var3 + var4;
        }
    }

    public static void main(String[] args) {

    }
}
