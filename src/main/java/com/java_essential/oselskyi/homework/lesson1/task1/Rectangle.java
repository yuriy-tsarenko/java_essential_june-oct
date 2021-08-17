package com.java_essential.oselskyi.homework.lesson1.task1;

import java.util.Scanner;

/**
 * Используя IDEA, создайте проект c пакетом. Требуется: Создать класс с именем Rectangle.
 * В теле класса создать два поля, описывающие длины сторон double side1, double side2.
 * Создать два метода, вычисляющие площадь прямоугольника – double areaCalculator (double side1, double side2)
 * и периметр прямоугольника – double perimeterCalculator (double side1, double side2).
 * Написать программу, которая принимает от пользователя длины двух сторон прямоугольника
 * и выводит на экран периметр и площадь.
 */
public class Rectangle {
    static double side1;
    static double side2;

    public static void main(String[] args) {
        System.out.print("Длина первой стороны = ");
        Scanner scanner1 = new Scanner(System.in);
        side1 = scanner1.nextDouble();
        System.out.print("Длина второй стороны = ");
        Scanner scanner2 = new Scanner(System.in);
        side2 = scanner2.nextDouble();
        System.out.println("Площадь = "
                + areaCalculator(side1, side2) + "\n"
                + "Периметр = "
                + perimetrCalculator(side1, side2));
    }

    public static double areaCalculator(double side1, double side2) {
        double area = side1 * side2;
        return area;
    }

    public static double perimetrCalculator(double side1, double side2) {
        double perimetr = (side1 + side2) * 2;
        return perimetr;
    }
}
