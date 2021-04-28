package com.company;

public class Motorcycle extends Vehicle {

    private int  maxSpeed;

    public Motorcycle (int wheelCount, int maxSpeed){
        super(wheelCount);
        this.maxSpeed = maxSpeed;
    }

    @Override
    protected void printInfo() {
        System.out.println("Vehicle: Motorcycle" + "\n" +
                "Number of wheels: " + wheelCount + "\n" +
                "Max Speed: " + maxSpeed + "km/h");
    }
}