package com.java_essential.examples.lesson7.ex001_exceptions;

import java.util.Scanner;

/**
 * Обработка исключений.
 */
public class Main {
    public static void main(String[] args) {
        int result = 0;

        ArithmeticException exception;
        do {
            Scanner scanner = new Scanner(System.in);

            System.out.println("enter the first value:");
            int firstValue = scanner.nextInt();

            System.out.println("enter the first value:");
            int secondValue = scanner.nextInt();
            exception = null;
            try {
                result = getResult(firstValue, secondValue);
            } catch (ArithmeticException e) {
                exception = e;
                e.printStackTrace();
            }
        } while (exception != null);
        System.out.println("result is:" + result);
    }

    public static int getResult(int firstValue, int secondValue) throws ArithmeticException {
        return firstValue / secondValue;
    }

}
