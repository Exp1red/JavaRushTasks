package com.javarush.task.task22.task2201;

public class OurUncaughtExceptionHandler implements Thread.UncaughtExceptionHandler {
    @Override
    public void uncaughtException(Thread t, Throwable e) {
        final String string = "%s : %s : %s";
        if (Solution.FIRST_THREAD_NAME.equals(t.getName())) {
            System.out.println(getFormattedStringForFirstThread(t, e, string));
        } else
            if (Solution.SECOND_THREAD_NAME.equals(t.getName())) {
                System.out.println(getFormattedStringForSecondThread(t, e, string));
            } else {
                System.out.println(getFormattedStringForOtherThread(t, e, string));
            }
    }

    protected String getFormattedStringForOtherThread(Thread t, Throwable e, String string) {
        return String.format ( string , e.getClass().getSimpleName() , e.getCause() , t.getName() );
    }

    protected String getFormattedStringForSecondThread(Thread t, Throwable e, String string) {
        return String.format ( string , e.getCause() , e.getClass().getSimpleName()  , t.getName());
    }

    protected String getFormattedStringForFirstThread(Thread t, Throwable e, String string) {
        return String.format(string ,t.getName() , e.getClass().getSimpleName() , e.getCause() );
    }
}

/*
3. Реализуйте логику трех protected методов в OurUncaughtExceptionHandler используя вызовы соответствующих методов согласно следующим шаблонам:
a) 1# : StringForFirstThreadTooShortException : java.lang.StringIndexOutOfBoundsException: String index out of range: -1
б) java.lang.StringIndexOutOfBoundsException: String index out of range: -1 : StringForSecondThreadTooShortException : 2#
в) RuntimeException : java.lang.StringIndexOutOfBoundsException: String index out of range: -1 : 3#

3. дальше свистопляска: ThisUncaughtExceptionHandler имеет единственный @Override метод, который выводит на консоль сообщение, которое собирается из пазлов в 3х других методах:
пазлы для (t, e, string): string формат строки с тремя переменными String
1#                               - t.getname
TooShort...Exception  - e.getClass.getSimpleName
java... : ..of range: -1  - e.getCause
return String.format (string, пазл,пазл,пазл)
 */