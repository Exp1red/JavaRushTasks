package com.javarush.task.task27.task2712.ad;

public class Advertisement {
     long amountPerOneDisplaying;
    private Object content;
  private String name;
  private long initialAmount;
  private int hits;
  private int duration;


    public Advertisement(Object content, String name, long initialAmount, int hits, int duration) {
        this.content = content;
        this.name = name;
        this.initialAmount = initialAmount;
        this.hits = hits;
        this.duration = duration;
        this.amountPerOneDisplaying = initialAmount/hits;
    }

    @Override
    public String toString() {
        return "fdggdfdf";
    }

    public String getName() {
        return name;
    }

    public int getDuration() {
        return duration;
    }

    public long getAmountPerOneDisplaying() {
        return amountPerOneDisplaying;
    }

    public  void revalidate(){
        if (hits == 0){
            throw new UnsupportedOperationException();
        }else {
            hits--;
        }
    }


    public int getHits() {
        return hits;
    }
}
