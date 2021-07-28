package com.java_essential.examples.lesson4;

public class Bicycle implements Vehicle {
    @Override
    public void runEngine() {
        System.out.println("bicycle haven't engine");
    }

    @Override
    public void moveLeft() {
        System.out.println("bicycle is moving left...");
    }

    @Override
    public void moveRight() {
        System.out.println("bicycle is moving right...");
    }

    @Override
    public void moveForward() {
        System.out.println("bicycle is moving forward...");
    }

    @Override
    public void moveBack() {
        System.out.println("can't move back");
    }
}
