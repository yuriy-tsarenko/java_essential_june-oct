package com.java_essential.safonov.homework.lesson3.Vehicle;

public class Car extends Vehicle {
    @Override
    public String toString() {
        return "Car{"
                + "Цена=" + price
                + ", год=" + year
                + ", Скорость=" + speed
                + '}';
    }
}
