package com.java_essential.starter_garmatyuk;

import java.util.Scanner;

/**
 * Задание 4 003_Variables
 * Используя IntelliJ IDEA, создайте класс Volume.
 * Напишите программу расчета объема - V и площади поверхности -S цилиндра.
 * Объем V цилиндра радиусом – R и высотой – h, вычисляется по формуле: V = πR2h
 * Площадь S поверхности цилиндра вычисляется по формуле: S = 2πR2 + 2πR2 = 2πR(R+h).
 * Результаты расчетов выведите на экран.
 */

public class Volume {
    public static void main(String[] args) {
        System.out.println("Введите радиус круга R: ");
        Scanner console = new Scanner(System.in);
        final double R = console.nextDouble();
        System.out.println("Радиус круга равен " + R);
        final double pi = Math.PI;
        System.out.println("Число 'ПИ' равно: " + pi);
        System.out.println("Введите высоту height: ");
        double height = console.nextDouble();
        System.out.println("Высота круга равна: " + height + "\n");

        System.out.println("Вычисляем объем цилиндра volume...");
        double volume = pi * Math.pow(R, 2) * height;
        System.out.println("Объем цилиндра равен:  \n" + volume);

        System.out.println("Вычисляем площадь поверхности цилиндра square...");
        double square = 2 * pi * R * (R + height);
        System.out.println("Площадь поверхности цилиндра square равна: " + square);
    }
}
