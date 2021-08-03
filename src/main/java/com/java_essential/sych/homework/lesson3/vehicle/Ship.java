package com.java_essential.sych.homework.lesson3.vehicle;

public class Ship extends Vehicle {
    int numberOfPassengers;
    String port;

    public Ship(int numberOfPassengers, String port) {
        this.numberOfPassengers = numberOfPassengers;
        this.port = port;
    }

    @Override
    public String toString() {
        return "Ship{"
                + "numberOfPassengers=" + numberOfPassengers
                + ", port='" + port + '\''
                + ", price=" + price
                + ", year=" + year
                + ", speed=" + speed
                + '}';
    }
}
