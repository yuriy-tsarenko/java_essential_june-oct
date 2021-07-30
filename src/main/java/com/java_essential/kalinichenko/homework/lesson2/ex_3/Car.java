package com.java_essential.kalinichenko.homework.lesson2.ex_3;

public class Car {
    int year;
    double speed;
    int weight;
    String colour;

    public Car() {
        this.year = 2012;
        this.speed = 400;
        this.weight = 1360;
        this.colour = "Blue";
    }

    public Car(int year) {
        this.year = year;
        this.speed = 400.0;
        this.weight = 1360;
        this.colour = "Blue";
    }

    public Car(int year, double speed) {
        this.year = year;
        this.speed = speed;
        this.weight = 1360;
        this.colour = "Blue";
    }

    public Car(int year, double speed, int weight) {
        this.year = year;
        this.speed = speed;
        this.weight = weight;
        this.colour = "Blue";
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
