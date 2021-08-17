package com.java_essential.kalinichenko.homework.lesson2.ex_2;

public class Car {
    int year;
    String colour;

    public Car() {
        this.year = 2020;
        this.colour = "Yellow";
    }

    public Car(int year) {
        this.year = year;
        this.colour = "Black";
    }

    public Car(int year, String colour) {
        this.year = year;
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "year = "
                + year
                + ", colour = "
                + colour;
    }

}
