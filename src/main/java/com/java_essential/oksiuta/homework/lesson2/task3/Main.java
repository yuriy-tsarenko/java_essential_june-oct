package com.java_essential.oksiuta.homework.lesson2.task3;

public class Main {
    public static void main(String[] args) {
        Car carOne = new Car();
        Car carTwo = new Car("Gray");
        Car carThree = new Car(2018, "Black");
        Car carFour = new Car(2019,210,"Red");
        Car carFive = new Car(2015,180,1010,"Green");

        System.out.println(carOne);
        System.out.println(carTwo);
        System.out.println(carThree);
        System.out.println(carFour);
        System.out.println(carFive);
    }
}
