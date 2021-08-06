package com.java_essential.kalinichenko.homework.lesson1.ex_2;

import java.util.Scanner;

public class RectangleMain {
    public static void main(String[] args) {
        System.out.println("Введите длину первой стороны прямоугольника:");
        Scanner scanner1 = new Scanner(System.in);
        double side1 = scanner1.nextDouble();

        System.out.println("Введите длину второй стороны прямоугольника:");
        Scanner scanner2 = new Scanner(System.in);
        double side2 = scanner2.nextDouble();

        Rectangle rectangle = new Rectangle(side1, side2);

        double area = rectangle.areaCalculator(side1, side2);
        double perimeter = rectangle.perimeterCalculator(side1, side2);

        System.out.println("Периметр прямоугольника: " + perimeter
                    + "\nПлощадь прямоугольника: " + area);
    }
}
