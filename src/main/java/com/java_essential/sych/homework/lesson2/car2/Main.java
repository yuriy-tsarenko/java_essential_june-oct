package com.java_essential.sych.homework.lesson2.car2;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(2000);
        Car car1 = new Car(2000, 2.5);
        Car car2 = new Car(200, 2.5, 100);
        Car car3 = new Car(200, 2.5, 100, "Green");

        System.out.println(car);
        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
    }
}
