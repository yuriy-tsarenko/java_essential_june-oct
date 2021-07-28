package com.java_essential.kvirikadze.homework.lesson3.issue2;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import static java.lang.String.format;

public class Ship extends Vehicle {
    @Getter @Setter private String homePort;
    @Getter @Setter private int maxPassengers;

    public Ship(String name, double price, int maxSpeed, int yearIssued, double latitude, double longitude) {
        super(name, price, maxSpeed, yearIssued, latitude, longitude);
    }

    @Override
    public String toString() {
        return super.toString()
                + "Порт приписки: " + homePort + "\n"
                + "Вместимость пассажиров: " + maxPassengers + "\n";
    }

}
