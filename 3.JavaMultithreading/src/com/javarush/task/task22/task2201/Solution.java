package com.javarush.task.task22.task2201;

/* 

3. Реализуйте логику трех protected методов в OurUncaughtExceptionHandler используя вызовы соответствующих методов согласно следующим шаблонам:
a) 1# : StringForFirstThreadTooShortException : java.lang.StringIndexOutOfBoundsException: String index out of range: -1
б) java.lang.StringIndexOutOfBoundsException: String index out of range: -1 : StringForSecondThreadTooShortException : 2#
в) RuntimeException : java.lang.StringIndexOutOfBoundsException: String index out of range: -1 : 3#
*/
public class Solution {
    public static void main(String[] args) {
        new Solution();
    }

    public static final String FIRST_THREAD_NAME = "1#";
    public static final String SECOND_THREAD_NAME = "2#";

    private Thread thread1;
    private Thread thread2;
    private Thread thread3;

    public Solution() {
        initThreads();
    }

    protected void initThreads() {
        this.thread1 = new Thread(new Task(this, "A\tB\tC\tD\tE\tF\tG\tH\tI"), FIRST_THREAD_NAME);
        this.thread2 = new Thread(new Task(this, "J\tK\tL\tM\tN\tO\tP\tQ\tR\tS\tT\tU\tV\tW\tX\tY\tZ"), SECOND_THREAD_NAME);
        this.thread3 = new Thread(new Task(this, "\t\t"), "3#");

        Thread.setDefaultUncaughtExceptionHandler(new OurUncaughtExceptionHandler());

        this.thread1.start();
        this.thread2.start();
        this.thread3.start();
    }

    public synchronized String getPartOfString(String string, String threadName) {
        try {
            return string.substring(string.indexOf("\t") + 1, string.lastIndexOf("\t"));
        }catch (StringIndexOutOfBoundsException e) {
            if (threadName.equals(FIRST_THREAD_NAME)) {
                throw new StringForFirstThreadTooShortException(e);

            } else if (threadName.equals(SECOND_THREAD_NAME)) {
                throw new StringForSecondThreadTooShortException(e);
            } else {
                throw new RuntimeException(e);
            }
        }
     }
}
/*
алгоритм в соответствии с условиями задачи:
1. в try получаем строку. при отсутствии возможности получить ее (не хватает знаков табуляции)
2. в cach ловим (StringIndexOutOfBoundsException ex) и через if / else или swith передаем эксепшен
throw new TooShortString... (ex) и throw new RuntimeException(ex);.
c RunTime все будет в порядке, а вот передачу ex в TooShort... компилятор не примет, так как у них не переопределены конструкторы, принимающие (Throwable cause).
 идем и наследуемся от Runtime и генерируем (alt + ins) конструктор ...(Throwable cause).

 */