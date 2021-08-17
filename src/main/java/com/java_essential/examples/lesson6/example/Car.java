package com.cbs.java_essential.examples.lesson6.example;

import lombok.ToString;

@ToString
public class Car {
    private int average;
    private String brand;
    private int id;

    public Car() {
    }

    public Car(int average, String brand, int id) {
        this.average = average;
        this.brand = brand;
        this.id = id;
    }

    public int getAverage() {
        return average;
    }

    public void setAverage(int average) {
        this.average = average;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
