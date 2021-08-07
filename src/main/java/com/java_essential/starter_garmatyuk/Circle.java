package com.java_essential.starter_garmatyuk;

import java.util.Scanner;

/**
 * Задание 3 003_Variables
 * Используя IntelliJ IDEA, создайте класс Circle.
 * Создайте константу с именем PI (число π «пи»), создайте переменную радиус с именем – r. Используя
 * формулу πR2,
 * вычислите площадь круга и выведите результат на экран.*/

public class Circle {
    public static void main(String[] args) {
        System.out.println("Введите радиус круга для вычесления площади круга: ");
        Scanner console = new Scanner(System.in);
        double radius = console.nextDouble();
        System.out.println("Радиус круга равен " + radius);
        final double pi = Math.PI;
        System.out.println("Число 'ПИ' равно: " + pi);

        double squareCircle = pi * Math.pow(radius, 2);
        System.out.println("Площадь круга равна: " + squareCircle);



    }
}
