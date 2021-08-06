package com.java_essential.baranovskyi.homework.lesson2.task2;

import java.util.Scanner;

class Rectangle {
    public static void main(String[] args) {
        Calculator rec = new Calculator();
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите длину прямоугольника: ");
        double side1 = sc.nextDouble();
        System.out.print("Введите ширину прямоугольника: ");
        double side2 = sc.nextDouble();

        rec.areaCalculator(side1,side2);
        rec.perimeterCalculator(side1,side2);
        rec.viewResult();
    }
}


class Calculator {
    double area;
    double perimeter;

    public double areaCalculator(double side1, double side2) {
        area = (side1 * side2);
        return area;
    }

    public double perimeterCalculator(double side1, double side2) {
        perimeter = (side1 * side2) * 2;
        return perimeter;
    }

    public void viewResult() {
        System.out.println("Площадь прямоугольника: " + area);
        System.out.println("Периметр прямоугольника: " + perimeter);
    }
}

