package com.java_essential.safonov.homework.lesson3.Vehicle;

public class Plane extends Vehicle {
    public int height = 5000;
    public int numberOfPassengers = 256;

    public Plane(int height, int numberOfPassengers){
        this.height = height;
        this.numberOfPassengers = numberOfPassengers;
    }

    @Override
    public String toString() {
        return "Plane{" +
                "Высота =" + height +
                ", Количество пассажиров=" + numberOfPassengers +
                ", Цена=" + price +
                ", Год=" + year +
                ", Скорость =" + speed +
                '}';
    }
}
