package com.java_essential.examples.lesson4;

public class Car implements Vehicle {
    @Override
    public void moveLeft() {
        System.out.println("car is moving left...");
    }

    @Override
    public void moveRight() {
        System.out.println("car is moving right...");
    }

    @Override
    public void moveForward() {
        System.out.println("car is moving forward...");
    }

    @Override
    public void moveBack() {
        System.out.println("car is moving back...");
    }
}
