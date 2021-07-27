package com.java_essential.examples.lesson3.polymorphism.demo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter type of vehicle: ");
        Scanner scanner = new Scanner(System.in);
        String userChoice = scanner.next();
        Vehicle vehicle = getVehicle(userChoice);

        System.out.println("type: " + vehicle.runEngine());
    }

    private static Vehicle getVehicle(String userChoice) {
        Vehicle vehicle;
        switch (userChoice) {
            case "Car":
                vehicle = new Car();
                break;
            case "Bike":
                vehicle = new Bike();
                break;
            case "Bicycle":
                vehicle = new Bicycle();
                break;
            default:
                throw new RuntimeException("unknown type");
        }
        return vehicle;
    }
}
