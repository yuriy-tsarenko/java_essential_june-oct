package com.java_essential.oksiuta.homework.lesson1.task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        Scanner input = new Scanner(System.in);

        System.out.println("Введите стороны прямоугольника (через Enter):");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();

        System.out.println("Площадь прямоугольника: " + rectangle.areaCalculator(side1, side2));
        System.out.println("Периметр прямоугольника: " + rectangle.perimeterCalculator(side1, side2));

    }
}
