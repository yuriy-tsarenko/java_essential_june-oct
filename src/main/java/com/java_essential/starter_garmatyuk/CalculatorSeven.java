package com.java_essential.starter_garmatyuk;

import java.util.Scanner;

public class CalculatorSeven {
    public static void main(String[] args) {
        System.out.println("Введите три целых числа");
        System.out.println("Первое число: ");
        Scanner console = new Scanner(System.in);
        int a = console.nextInt();
        System.out.println("Второе число: ");
        int b = console.nextInt();
        System.out.println("Третье число : ");
        int c = console.nextInt();

        System.out.println("Среднее арифметическое равно: " + calculate(a,b,c));
    }

     static int calculate(int a, int b, int c) {
        return (a + b + c) / 3;
    }
}