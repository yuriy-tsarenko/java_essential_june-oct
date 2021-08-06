package com.java_essential.safonov.homework.lesson2.lessCar;

public class Car {
    int ear;
    String color;

    Car(int ear) {
        this.ear = ear;
    }

    Car(int ear, String color) {
        this.ear = ear;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{"
                + "ear=" + ear
                + ", color='" + color + '\''
                + '}';
    }
}
