package com.java_essential.oksiuta.homework.lesson2.task2;

public class Car {
    private int year;
    private  String colour;

    public Car() {
    }

    public Car(int year) {
        this.year = year;
    }

    public Car(int year, String colour) {
        this.year = year;
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Car{"
                + "year=" + year
                + ", colour='" + colour + '\''
                + '}';
    }
}
