package com.java_essential.oselskyi.homework.lesson3.task2;

public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car(23000, 200, 2013);
        Vehicle plane = new Plane(1240000, 500, 2020, 800, 300);
        Vehicle ship = new Ship(3000000, 18, 2015, 70, "Одесса");

        ship.showInfo();
        plane.showInfo();
        car.showInfo();
    }
}
