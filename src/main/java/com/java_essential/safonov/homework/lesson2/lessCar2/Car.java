package com.java_essential.safonov.homework.lesson2.lessCar2;

public class Car {
    int ear;
    double speed;
    int weight;
    String color;

    public Car() {
        this.ear = 20;
        this.speed = 100;
        this.weight = 1000;
        this.color = "Grin";
    }

    public Car(int ear) {
        this.ear = ear;
    }

    public Car(int ear, double speed) {
        this.ear = ear;
        this.speed = speed;
    }

    public Car(int ear, double speed, int weight) {
        this.ear = ear;
        this.speed = speed;
        this.weight = weight;
    }

    public Car(int ear, double speed, int weight, String color) {
        this.ear = ear;
        this.speed = speed;
        this.weight = weight;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{"
                + "ear=" + ear
                + ", speed=" + speed
                + ", weight=" + weight
                + ", color='" + color + '\''
                + '}';
    }
}
