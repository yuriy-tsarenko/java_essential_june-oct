package com.java_essential.sych.homework.lesson2;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(2000);
        Car car1 = new Car(2006, "Red");


        System.out.println(car.getYear());
        System.out.println(car1.getYear() + " " + car1.getColor());
    }
}
