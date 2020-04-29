package com.javarush.task.task30.task3003;

import java.util.concurrent.TransferQueue;

public class Producer implements Runnable {
    TransferQueue<ShareItem> queue;
    public Producer(TransferQueue<ShareItem> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        for (int i = 1; i <10 ; i++){
            System.out.format("Элемент 'ShareItem- %d' добавлен %n",  i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
            }

            queue.offer(new ShareItem(i));

            if (queue.hasWaitingConsumer()){
                System.out.format("Consumer в ожидании!%n");
            }

        }
    }
}
