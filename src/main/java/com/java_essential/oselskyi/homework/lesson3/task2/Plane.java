package com.java_essential.oselskyi.homework.lesson3.task2;

public class Plane extends Vehicle {
    int altitude;
    int numOfPasengers;

    public Plane(int price, int speed, int year, int altitude, int numOfPasengers) {
        super(price, speed, year);
        this.altitude = altitude;
        this.numOfPasengers = numOfPasengers;
    }


    @Override
    public String toString() {
        return "Самолет {"
                + "Максимальная высота = " + altitude + " метров"
                + ", макс. количество пасажиров = " + numOfPasengers
                + ", цена = " + price + "$"
                + ", макс. скорость = " + speed + " км/ч"
                + ", год выпуска = " + year
                + '}';
    }
}
