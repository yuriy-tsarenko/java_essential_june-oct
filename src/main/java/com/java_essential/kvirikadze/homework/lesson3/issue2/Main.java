package com.java_essential.kvirikadze.homework.lesson3.issue2;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Daewoo Lanos", 3500.00, 160, 1997, 43.24, 22.45);

        Ship ship = new Ship("Oasis of the Seas", 1400000000.00, 45, 2008, 11.24, 52.451);
        ship.setMaxPassengers(6880);
        ship.setHomePort("Майами, США");

        Plane plane = new Plane("Airbus A380",489000000.00,945, 2007, 54.11, 43.22);
        plane.setMaxAttitude(13115);
        plane.setSeatCount(853);

        System.out.println(car);
        System.out.println("---------------------\n");
        System.out.println(ship);
        System.out.println("---------------------\n");
        System.out.println(plane);
        System.out.println("---------------------\n");
    }
}
