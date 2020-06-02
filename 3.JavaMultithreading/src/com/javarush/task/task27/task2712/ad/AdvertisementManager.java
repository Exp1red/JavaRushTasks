package com.javarush.task.task27.task2712.ad;

import com.javarush.task.task27.task2712.ConsoleHelper;

import java.util.*;
import java.util.concurrent.ConcurrentLinkedDeque;

public class AdvertisementManager {
    private final AdvertisementStorage storage = AdvertisementStorage.getInstance();
    private int timeSeconds;

    public AdvertisementManager(int timeSeconds) {
        this.timeSeconds = timeSeconds * 60;
    }
    public void processVideos() throws NoVideoAvailableException{

 /*       storage.add(new Advertisement(new Object(),"First Video",200,3,16));
        storage.add(new Advertisement(new Object(),"Second Video",300,3,20));
        storage.add(new Advertisement(new Object(),"Nice Video",150,4,12));
        storage.add(new Advertisement(new Object(),"Fourth Video",100,3,17));
        storage.add(new Advertisement(new Object(),"Fifth Video",321,3,16));*/


        Deque<Advertisement> advertisements = getMaximumProfit(new ArrayList<>(storage.list()),new ConcurrentLinkedDeque<>(),0);
        ArrayList<Advertisement> arrayList = new ArrayList<>(Arrays.asList(advertisements.toArray(new Advertisement[0])));
        arrayList.sort(new Comparator<Advertisement>() {
            @Override
            public int compare(Advertisement o1, Advertisement o2) {
                return Long.compare(o1.amountPerOneDisplaying,o2.amountPerOneDisplaying)*-1;
            }
        }.thenComparing(new Comparator<Advertisement>() {
            @Override
            public int compare(Advertisement o1, Advertisement o2) {
                long a = o1.amountPerOneDisplaying * 1000 / o1.getDuration();
                long b = o2.amountPerOneDisplaying * 1000 / o2.getDuration();
                return Long.compare(a,b);
            }
        }));

        arrayList.forEach((d)->{d.revalidate();
            ConsoleHelper.writeMessage(String.format("%s is displaying... %d, %d",d.getName(),d.amountPerOneDisplaying,d.amountPerOneDisplaying * 1000 / d.getDuration()));});
    }

    public Deque<Advertisement> getMaximumProfit(List<Advertisement> list, Deque<Advertisement> newList, int timeCount) {
        Deque<Advertisement> Deque = new ConcurrentLinkedDeque<>(newList);
        for (Advertisement advertisement : list) {
            if(advertisement.getHits()>0&&!(Deque.contains(advertisement))&&(timeCount+advertisement.getDuration()<timeSeconds)) {
                newList.add(advertisement);
                Deque<Advertisement> temp = getMaximumProfit(list,newList,timeCount+advertisement.getDuration());
                if(toCompare(Deque,temp)){
                    Deque=temp;
                }
                newList.pollLast();
            }
        }

        return Deque;
    }

    public static boolean toCompare(Deque<Advertisement> a,Deque<Advertisement> b){
        int count_a=0,count_b=0;
        int time_a=0,time_b=0;
        int size_a=0,size_b=0;
        for (Advertisement advertisement : a) {
            count_a+=advertisement.getAmountPerOneDisplaying();
            time_a+=advertisement.getDuration();
        }
        size_a=a.size();

        for (Advertisement advertisement : b) {
            count_b+=advertisement.getAmountPerOneDisplaying();
            time_b+=advertisement.getDuration();
        }
        size_b=b.size();
        if(count_b>count_a)return true;
        else {
            if(count_a==count_b){
                if(time_b>time_a)return true;
                else if(size_b<size_a)return true;
            }
            return false;
        }
    }

}