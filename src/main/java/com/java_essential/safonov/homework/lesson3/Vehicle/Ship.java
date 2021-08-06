package com.java_essential.safonov.homework.lesson3.Vehicle;


public class Ship extends Vehicle {
    public int numberOfPassengers;
    public String port;

    public Ship(int numberOfPassengers, String port) {
        this.numberOfPassengers = numberOfPassengers;
        this.port = port;
    }

    @Override
    public String toString() {
        return "Ship{"
                + "Количество пассажиров =" + numberOfPassengers
                + ", Порт ='" + port + '\''
                + ", Цена =" + price
                + ", Год =" + year
                + ", Скорость =" + speed
                + '}';
    }
}
