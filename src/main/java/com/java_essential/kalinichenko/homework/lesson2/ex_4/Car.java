package com.java_essential.kalinichenko.homework.lesson2.ex_4;

public class Car {
    int year;
    double speed;
    int weight;
    String colour;

    public Car() {
        this(2012, 480.0, 1580, "Red");
    }

    public Car(int year) {
        this(year, 520.0, 1580, "Green");
    }

    public Car(int year, double speed) {
        this(year, speed, 1480, "Grey");
    }

    public Car(int year, double speed, int weight) {
        this(year, speed, weight, "White");
    }

    public Car(int year, double speed, int weight, String colour) {
        this.year = year;
        this.speed = speed;
        this.weight = weight;
        this.colour = colour;
    }

    @Override
    public String toString() {
        return  "year = "
                + year
                + ", speed = "
                + speed
                + ", weight = "
                + weight
                + ", colour = "
                + colour;
    }

}
