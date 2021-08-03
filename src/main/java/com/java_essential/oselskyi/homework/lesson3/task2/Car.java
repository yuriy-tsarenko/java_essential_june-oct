package com.java_essential.oselskyi.homework.lesson3.task2;

public class Car extends Vehicle {
    public Car(int price, int speed, int year) {
        super(price, speed, year);
    }


    @Override
    public String toString() {
        return "Car {"
                + "Цена = " + price + "$"
                + ", Максимальная скорость = " + speed + " км/ч"
                + ", Год выпуска = " + year
                + '}';
    }
}
