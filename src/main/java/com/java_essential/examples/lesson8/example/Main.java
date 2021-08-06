package com.java_essential.examples.lesson8.example;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle(1, "vehicle");
        Bike bike1 = new Bike(1, "vehicle", vehicle);
        Bike bike2 = new Bike(1, "vehicle", vehicle);

        Set<Bike> bikes = new HashSet<>();
        bikes.add(bike1);
        bikes.add(bike2);
        bikes.forEach(bike -> System.out.println(bike));

        int carHash = vehicle.hashCode();
        int bikeHash = bike1.hashCode();

        System.out.println(carHash);
        System.out.println(bikeHash);

        System.out.println(vehicle.getClass());
        System.out.println(bike1.getClass());

        System.out.println(vehicle.equals(bike1));


    }
}

