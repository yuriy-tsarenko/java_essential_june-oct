package com.java_essential.sych.homework.lesson1.rectangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введіть значення першої сторони");
        double side1 = s.nextDouble();
        System.out.println("Введіть значення другої сторони");
        double side2 = s.nextDouble();
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle.perimeterCalculator(side1, side2));
        System.out.println(rectangle.areaCalculator(side1,side2));

    }

}
