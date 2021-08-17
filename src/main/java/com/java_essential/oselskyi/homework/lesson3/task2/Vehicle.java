package com.java_essential.oselskyi.homework.lesson3.task2;


public class Vehicle {
    int price;
    int speed;
    int year;

    public Vehicle(int price, int speed, int year) {
        this.price = price;
        this.speed = speed;
        this.year = year;
    }

    public void showInfo() {
        System.out.println(toString());
    }
}
