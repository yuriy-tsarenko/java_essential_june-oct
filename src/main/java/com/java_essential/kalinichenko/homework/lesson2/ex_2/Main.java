package com.java_essential.kalinichenko.homework.lesson2.ex_2;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car(2012);
        Car car3 = new Car(2018, "Purple");

        System.out.println("Car 1: " + car1.toString());
        System.out.println("Car 2: " + car2.toString());
        System.out.println("Car 3: " + car3.toString());
    }
}
