package com.java_essential.oksiuta.homework.lesson2.task2;

public class Main {
    public static void main(String[] args) {
        Car carOne = new Car();
        Car carTwo = new Car(2020);
        Car carThree = new Car(2018, "Black");

        System.out.println(carOne);
        System.out.println(carTwo);
        System.out.println(carThree);
    }
}
