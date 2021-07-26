package com.java_essential.safonov.homework.lesson3.Vehicle;


public class Main {
    public static void main(String[] args) {
        Ship ship = new Ship(280,"Дубай");
        Car car = new Car();
        Plane plane = new Plane(5800, 250);

        System.out.println(ship);
        System.out.println(car);
        System.out.println(plane);


    }
}
