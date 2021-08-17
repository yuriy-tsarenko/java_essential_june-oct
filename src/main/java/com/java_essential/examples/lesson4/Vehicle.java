package com.java_essential.examples.lesson4;

public interface Vehicle {

    default void runEngine() {
        System.out.println("engine working...");
    }

    void moveLeft();

    void moveRight();

    void moveForward();

    void moveBack();

}
