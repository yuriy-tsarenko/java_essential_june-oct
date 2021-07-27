package com.java_essential.starter_garmatyuk;

import java.util.Scanner;

/**
 * Задание 4 003_Variables
 * Используя IntelliJ IDEA, создайте класс Volume.
 * Напишите программу расчета объема - V и площади поверхности -S цилиндра.
 * Объем V цилиндра радиусом – R и высотой – h, вычисляется по формуле: V = πR2h
 * Площадь S поверхности цилиндра вычисляется по формуле: S = 2πR2 + 2πR2 = 2πR(R+h).
 * Результаты расчетов выведите на экран. */

public class Volume {
    public static void main(String[] args) {
        System.out.println("Введите радиус круга R: ");
        Scanner console = new Scanner(System.in);
        final double R = console.nextDouble();
        System.out.println("Радиус круга равен " + R);
        final double PI = Math.PI;
        System.out.println("Число 'ПИ' равно: " + PI);
        System.out.println("Введите высоту h: ");
        double h = console.nextDouble();
        System.out.println("Высота круга равна: " + h + "\n");

        System.out.println("Вычисляем объем цилиндра V...");
        double V = PI * Math.pow(R, 2) * h;
        System.out.println("Объем цилиндра равен:  \n" + V);

        System.out.println("Вычисляем площадь поверхности цилиндра S...");
        double S = 2 * PI * R * (R + h);
        System.out.println("Площадь поверхности цилиндра S равна: " + S);
    }
}
