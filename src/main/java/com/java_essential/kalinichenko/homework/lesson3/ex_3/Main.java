package com.java_essential.kalinichenko.homework.lesson3.ex_3;

public class Main {
    public static void main(String[] args) {
        Plane plane = new Plane(260500000, 1150, 2012);
        Car car = new Car(30000, 500, 2020);
        Ship ship = new Ship(1300000000L, 20, 2016);

        plane.showPlane();
        car.showCar();
        ship.showShip();
    }
}
