package com.java_essential.kalinichenko.homework.lesson3.ex_3;

public class Vehicle {
    long price;
    double speed;
    int year;

    Vehicle(long price, double speed, int year) {
        this.price = price;
        this.speed = speed;
        this.year = year;
    }
}

class Plane extends Vehicle {
    double height;
    int passengers;

    Plane(long price, double speed, int year) {
        super(price, speed, year);
        this.height = 19.4;
        this.passengers = 467;
    }
    void showPlane() {
        System.out.println("Plane: "
                        + "price - " +
                        + price + ", "
                        + "speed - " +
                        + speed + ", "
                        + "year - " +
                        + year + ", "
                        + "height - " +
                        + height + ", "
                        + "passengers - "
                        + passengers);
    }
}

class Car extends Vehicle {

    Car(long price, double speed, int year) {
        super(price, speed, year);
    }

    void showCar() {
        System.out.println("Car: "
                + "price - " +
                + price + ", "
                + "speed - " +
                + speed + ", "
                + "year - " +
                + year);
    }
}

class Ship extends Vehicle {
    int passengers;
    String homePort;
    
    Ship(long price, double speed, int year) {
        super(price, speed, year);
        this.passengers = 5479;
        this.homePort = "Haccay";
    }

    void showShip() {
        System.out.println("Ship: "
                + "price - " +
                + price + ", "
                + "speed - " +
                + speed + ", "
                + "year - " +
                + year + ", "
                + "passenger - "
                + passengers + ", "
                + "home port - "
                + homePort);
    }
}
