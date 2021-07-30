package com.java_essential.kalinichenko.homework.lesson2.ex_3;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car(2020);
        Car car3 = new Car(2019, 550);
        Car car4 = new Car(2018, 480, 1550);
        Car car5 = new Car(2018, 600, 1600, "Purple");

        System.out.println("Car 1: " + car1.toString());
        System.out.println("Car 2: " + car2.toString());
        System.out.println("Car 3: " + car3.toString());
        System.out.println("Car 4: " + car4.toString());
        System.out.println("Car 5: " + car5.toString());
    }
}
