package com.java_essential.safonov.homework.lesson1.Rectangle;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        double side1;
        double side2;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длинну");
        side1 = scanner.nextInt();
        System.out.println("Введите ширину");
        side2 = scanner.nextInt();

        System.out.println("Площать прямоугольника = " + rectangle.areaCalculator(side1,side2));
        System.out.println("Периметр прямогугольника = " + rectangle.perimeterCalculator(side1,side2));

    }
    public double areaCalculator (double side1, double side2){
       double area;
        area = (side1 * side2);
        return area;
    }
    public double perimeterCalculator (double side1, double side2){
        double perimeter;
        perimeter = (side1 + side2) * 2;
        return perimeter;
    }
}
