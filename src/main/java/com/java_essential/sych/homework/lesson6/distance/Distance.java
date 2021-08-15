package com.java_essential.sych.homework.lesson6.distance;

import java.util.Scanner;

public class Distance {
    private double distance;

    void print() {

    }

    public static class Converter {


        static void converter1() {
            double km;
            double mils;
            Scanner input = new Scanner(System.in);
            System.out.println("Введіть значення в кілометрах");
            km = input.nextDouble();
            input.close();

            mils = (km * 0.621371);
            System.out.println(km + "km " + "= " + mils + "mils");
        }
    }
}
