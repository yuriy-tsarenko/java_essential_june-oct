package com.java_essential.sych.homework.lesson3.vehicle;

public class Main {
    public static void main(String[] args) {
        Ship ship = new Ship(2100, "Нью-Йорк");
        Car car = new Car();
        Plane plane = new Plane(3700, 128);

        System.out.println(ship);
        System.out.println(car);
        System.out.println(plane);

    }
}
