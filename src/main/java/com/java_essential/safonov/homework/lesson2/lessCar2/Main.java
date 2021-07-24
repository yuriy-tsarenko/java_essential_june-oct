package com.java_essential.safonov.homework.lesson2.lessCar2;

public class Main {
    public static void main(String[] args) {

        Car car = new Car();
        Car car1 = new Car(1980);
        Car car2 = new Car(1985,280);
        Car car3 = new Car(1990,285,150);
        Car car4 = new Car(1995,290,160,"Red");

        System.out.println("Машина3 " + car.toString());
        System.out.println("Машина1 " + car1.toString());
        System.out.println("Машина2 " + car2.toString());
        System.out.println("Машина4 " + car3.toString());
        System.out.println("Машина5 " + car4.toString());

    }
}
