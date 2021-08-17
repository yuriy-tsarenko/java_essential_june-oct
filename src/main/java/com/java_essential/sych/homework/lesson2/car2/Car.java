package com.java_essential.sych.homework.lesson2.car2;

public class Car {
    int year;
    double weight;
    int speed;
    String color;

    public Car() {

    }

    public Car(int year) {
        this.year = year;
    }

    public Car(int year, double weight) {
        this.year = year;
        this.weight = weight;
    }

    public Car(int year, double weight, int speed) {
        this.year = year;
        this.weight = weight;
        this.speed = speed;
    }

    public Car(int year, double weight, int speed, String color) {
        this.year = year;
        this.weight = weight;
        this.speed = speed;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{"
                + "year=" + year
                + ", weight=" + weight
                + ", speed=" + speed
                + ", color='" + color + '\''
                + '}';
    }
}
