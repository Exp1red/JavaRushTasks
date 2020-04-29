package com.javarush.task.task28.task2805;

import java.util.concurrent.atomic.AtomicInteger;

public class MyThread extends Thread {
       static AtomicInteger count = new AtomicInteger(0);

    {
        setPriority(count.getAndIncrement() % 10 + 1);
    }

    public MyThread() {
//        if (count.get() < 10){
//           setPriority( count.incrementAndGet());
//        }else {
//            count.set(1);
//            setPriority(count.get());
//        }
    }

    public MyThread(Runnable target) {
        super(target);
    }

    public MyThread(ThreadGroup group, Runnable target) {
        super(group, target);
    }

    public MyThread(String name) {
        super(name);
    }

    public MyThread(ThreadGroup group, String name) {
        super(group, name);

    }

    public MyThread(Runnable target, String name) {
        super(target, name);
    }

    public MyThread(ThreadGroup group, Runnable target, String name) {
        super(group, target, name);
    }

    public MyThread(ThreadGroup group, Runnable target, String name, long stackSize) {
        super(group, target, name, stackSize);
    }


}
