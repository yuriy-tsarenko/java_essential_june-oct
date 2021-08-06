package com.java_essential.oselskyi.homework.lesson3.task2;

public class Ship extends Vehicle {
    int numOfPasengers;
    String mainPort;

    public Ship(int price, int speed, int year, int numOfPasengers, String mainPort) {
        super(price, speed, year);
        this.numOfPasengers = numOfPasengers;
        this.mainPort = mainPort;
    }


    @Override
    public String toString() {
        return "Судно {"
                + "Количество пасажиров = " + numOfPasengers
                + ", порт приписки = '" + mainPort + '\''
                + ", цена = " + price + "$"
                + ", макс. скорость = " + speed + " узлов"
                + ", год выпуска = " + year
                + '}';
    }
}
