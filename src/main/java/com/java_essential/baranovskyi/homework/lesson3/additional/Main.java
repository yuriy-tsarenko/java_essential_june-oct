package com.java_essential.baranovskyi.homework.lesson3.additional;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите радиус круга: ");
        double radius = sc.nextDouble();
        System.out.println("Площадь круга равняется = " + MyArea.areaOfCircle(radius));
    }
}
