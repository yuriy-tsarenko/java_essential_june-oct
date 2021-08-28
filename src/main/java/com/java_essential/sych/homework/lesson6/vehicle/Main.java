package com.java_essential.sych.homework.lesson6.vehicle;

public class Main {
    public static void main(String[] args) {
        Vehicle.Wheel whl = new Vehicle().new Wheel();
        Vehicle.Door dr = new Vehicle().new Door();
        Vehicle vhl = new Vehicle();

        whl.print();
        dr.print();
        vhl.print();
    }
}
