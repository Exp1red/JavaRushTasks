package com.javarush.task.task29.task2909.car;

import java.util.Calendar;
import java.util.Date;

public abstract class Car {
    static public final int TRUCK = 0;
    static public final int SEDAN = 1;
    static public final int CABRIOLET = 2;

    static final int MAX_TRUCK_SPEED = 80;
    static final int MAX_SEDAN_SPEED = 120;
    static final int MAX_CABRIOLET_SPEED = 90;

    double fuel;

    public double summerFuelConsumption;
    public double winterFuelConsumption;
    public double winterWarmingUp;

    private int type;

    private boolean driverAvailable;
    private int numberOfPassengers;

    protected Car(int type, int numberOfPassengers) {
        this.type = type;
        this.numberOfPassengers = numberOfPassengers;
    }
/*======================================================================*/

    private boolean canPassengersBeTransferred(){
        return isDriverAvailable() && fuel > 0 ;
    }

    public  boolean isSummer(Date date, Date summerStart, Date summerEnd){
        return date.after(summerStart) && date.before(summerEnd);
    }


    public double getWinterConsumption(int length){
        return (winterFuelConsumption*length)+winterWarmingUp;
    }

    public double getSummerConsumption(int length){
        return summerFuelConsumption*length;
    }


    public double getTripConsumption(Date date, int length, Date summerStart, Date summerEnd) {
//
         return isSummer(date , summerStart , summerEnd) ? getSummerConsumption(length) : getWinterConsumption(length);
    }
    /*======================================================================*/
    public static Car create(int type, int numberOfPassengers){
        switch (type) {
            case TRUCK : return new Truck( numberOfPassengers);
            case SEDAN : return new Sedan( numberOfPassengers);
            case CABRIOLET : return new Cabriolet( numberOfPassengers);
            default: return null;
        }
    }

    public void fill(double numberOfLiters) throws Exception {
        if (numberOfLiters < 0) {
            throw  new Exception();
            }
            fuel += numberOfLiters;
    }


    public int getNumberOfPassengersCanBeTransferred() {
//        if (!isDriverAvailable())
//            return 0;
//        if (fuel <= 0)
//            return 0;
            if (canPassengersBeTransferred()) {
                return numberOfPassengers;
            } else return 0;
     //   return canPassengersBeTransferred() ? numberOfPassengers : 0;
    }

    public boolean isDriverAvailable() {
        return driverAvailable;
    }

    public void setDriverAvailable(boolean driverAvailable) {
        this.driverAvailable = driverAvailable;
    }

    public void startMoving() {
            fastenDriverBelt();
        if (numberOfPassengers > 0) {
            fastenPassengersBelts();
        }
    }

    public void fastenPassengersBelts() {
    }

    public void fastenDriverBelt() {
    }

    public abstract int getMaxSpeed();
}
//        if (type == TRUCK)
//            return MAX_TRUCK_SPEED;
//        if (type == SEDAN)
//            return MAX_SEDAN_SPEED;
//        return MAX_CABRIOLET_SPEED;
