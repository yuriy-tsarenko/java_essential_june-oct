package com.java_essential.safonov.homework.lesson2.myArea;

import java.util.Scanner;

public class MyArea {
    final double pi = 3.14;

    public static double areaOfCircle(double pi) {
        double radius;
        double square;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите радиус круга ");
        radius = scanner.nextDouble();

        square = pi * Math.pow(radius, 2);
        return square;
    }

    public void areaShow() {
        System.out.println("Площадь круга = " + areaOfCircle(pi));
    }

}
