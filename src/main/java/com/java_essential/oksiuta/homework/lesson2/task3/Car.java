package com.java_essential.oksiuta.homework.lesson2.task3;

public class Car {
    private int year;
    private double speed;
    private int weight;
    private  String colour;

    public Car() {
        this(2021, 210, 900, "White");
    }

    public Car(String colour) {
        this(2021, 210, 900, colour);
    }

    public Car(int year, String colour) {
        this(year, 210, 900, colour);
    }

    public Car(int year, double speed, String colour) {
        this(year, speed, 900, colour);
    }

    public Car(int year, double speed, int weight, String colour) {
        this.year = year;
        this.speed = speed;
        this.weight = weight;
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Car{"
                + "year=" + year
                + ", speed=" + speed
                + ", weight=" + weight
                + ", colour='" + colour + '\''
                + '}';
    }
}
