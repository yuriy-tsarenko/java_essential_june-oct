package com.java_essential.starter_garmatyuk;

import java.util.Scanner;

/**
 * Доп. задание
 * Используя IntelliJ IDEA, создайте класс Calculator.
 * Создайте метод с именем calculate, который принимает в качестве параметров три целочисленных
 * значения и возвращает значение каждого аргумента, деленного на 5.
 */
public class CalculatorEighth {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите три целых числа: ");
        int inputA = console.nextInt();
        int inputB = console.nextInt();
        int inputC = console.nextInt();
        System.out.println("Теперь поделим каждый по пять раз...");
        CalculatorEighth calculatorEighth = new CalculatorEighth();
        calculatorEighth.calculate(inputA, inputB, inputC);


    }

    private void calculate(int a, int b, int c) {
        double resultA = a / 5;
        double resultB = b / 5;
        double resultC = c / 5;
        System.out.println(resultA);
        System.out.println(resultB);
        System.out.println(resultC);

    }

}
