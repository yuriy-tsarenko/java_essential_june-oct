package com.java_essential.sych.homework.lesson3.vehicle;

public class Plane extends Vehicle {
    int height;
    int numberOfPassengers;

    public Plane(int height, int numberOfPassengers) {
        this.height = height;
        this.numberOfPassengers = numberOfPassengers;
    }

    @Override
    public String toString() {
        return "Plane{"
                + "height=" + height
                + ", numberOfPassengers=" + numberOfPassengers
                + ", price=" + price
                + ", year=" + year
                + ", speed=" + speed
                + '}';
    }
}
