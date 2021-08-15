package com.java_essential.oksiuta.homework.lesson2.additional;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите радиус круга:");
        Scanner input = new Scanner(System.in);
        double r = input.nextDouble();

        System.out.println("Площадь круга: " + MyArea.areaOfCircle(r));
    }
}
