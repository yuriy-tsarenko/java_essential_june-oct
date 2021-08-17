package com.java_essential.kalinichenko.homework.lesson2.ex_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите радиус круга: ");
        Scanner sc = new Scanner(System.in);
        float r = sc.nextFloat();
        System.out.println(MyArea.areaOgCircle(r));
    }
}

