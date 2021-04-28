package com.company;

public class Car extends Vehicle implements Costable{

    private int doorsCount;

    public Car (int wheelCount, int doorsCount){
        super(wheelCount);
        this.doorsCount = doorsCount;
    }

    @Override
    protected void printInfo() {
        System.out.println("Vehicle: Car" + "\n" +
                "Number of doors: " + doorsCount + "\n" +
                "Number of wheels: " + wheelCount + "\n" + "Cost: " + getCost() + "$");

    }

    @Override
    public int getCost() {
        return (int) (Math.random() * 10000);
    }
}