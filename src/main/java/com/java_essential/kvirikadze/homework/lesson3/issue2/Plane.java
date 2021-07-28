package com.java_essential.kvirikadze.homework.lesson3.issue2;

import lombok.Getter;
import lombok.Setter;

public class Plane extends Vehicle {
    @Getter @Setter private int maxAttitude;
    @Getter @Setter private int seatCount;

    public Plane(String name, double price, int maxSpeed, int yearIssued, double latitude, double longitude) {
        super(name, price, maxSpeed, yearIssued, latitude, longitude);
    }

    @Override
    public String toString() {
        return super.toString()
               + "Максимальная высота полета: " + maxAttitude + "\n"
               + "Вместимость пассажиров: " + seatCount + "\n";
    }

}
