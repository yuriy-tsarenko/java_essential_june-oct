package com.java_essential.examples.lesson4;

import java.util.Scanner;

public class InterfaceDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Vehicle vehicle = null;
        String type = scanner.next();
        switch (type) {
            case "Car":
                vehicle = new Car();
                break;
            case "Bicycle":
                vehicle = new Bicycle();
                break;
            default:
                System.err.println("unexpected value");
                System.exit(-1);
        }

        vehicle.runEngine();
        vehicle.moveLeft();
        vehicle.moveRight();
        vehicle.moveForward();
        vehicle.moveBack();
    }
}
