package com.java_essential.kvirikadze.homework.lesson3.issue2;

import lombok.Getter;
import lombok.Setter;

import static java.lang.String.format;

public class Vehicle {
    @Getter private String name;
    @Getter private double price;
    @Getter private int maxSpeed;
    @Getter private int yearIssued;
    @Setter @Getter private double latitude;
    @Setter @Getter private double longitude;

    public Vehicle(String name, double price, int maxSpeed, int yearIssued, double latitude, double longitude) {
        this.name = name;
        this.price = price;
        this.maxSpeed = maxSpeed;
        this.yearIssued = yearIssued;
        this.longitude = longitude;
        this.latitude = latitude;
    }

    @Override
    public String toString() {
        return format("Транспортное средство типа: %s\n", this.getClass().getSimpleName())
                + "Название: " + name + "\n"
                + "Цена: " + price + "\n"
                + "Максимальная скорость: " + maxSpeed + " км/ч\n"
                + "Год выпуска: " + yearIssued + "\n"
                + "Координаты: " + latitude + ":" + longitude + "\n";
    }
}
