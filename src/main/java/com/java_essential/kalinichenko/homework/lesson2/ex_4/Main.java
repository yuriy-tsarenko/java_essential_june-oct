package com.java_essential.kalinichenko.homework.lesson2.ex_4;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car(2018);
        Car car3 = new Car(2018, 360.5);
        Car car4 = new Car(2018, 360.5, 1290);
        Car car5 = new Car(2018, 360.5, 1290, "Silver");

        System.out.println("Car 1: " + car1.toString());
        System.out.println("Car 2: " + car2.toString());
        System.out.println("Car 3: " + car3.toString());
        System.out.println("Car 4: " + car4.toString());
        System.out.println("Car 5: " + car5.toString());
    }
}
