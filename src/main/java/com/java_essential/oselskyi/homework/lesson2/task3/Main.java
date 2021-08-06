package com.java_essential.oselskyi.homework.lesson2.task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Enter the radius of the circle: ");
        Scanner scanner = new Scanner(System.in);
        double radius = scanner.nextDouble();
        double area = MyArea.areaOfCircle(radius);
        System.out.println("Area of your circle = " + area);
    }
}
