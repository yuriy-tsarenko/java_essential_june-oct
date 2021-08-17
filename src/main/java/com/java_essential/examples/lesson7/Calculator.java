package com.java_essential.examples.lesson7;

import org.apache.log4j.Logger;

import java.util.Scanner;

public class Calculator {

    private static final Logger log = Logger.getLogger(Calculator.class);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            log.info("Application started");
            System.out.println("first value:");
            int first = scanner.nextInt();
            System.out.println("second value:");
            int second = scanner.nextInt();
            scanner = new Scanner(System.in);
            System.out.println("operator value:");
            String operator = scanner.next();
            try {
                int result = getResult(first, second, operator);
                System.out.println("result: " + result);
                flag = false;
            } catch (ArithmeticException e) {
                log.warn(e);
                System.out.println(e.getMessage());//логи ищите в папке logs/simpleLog.log
                System.out.println("try again");
            }
        }
    }


    public static int getResult(int first, int second, String operator) throws ArithmeticException {
        switch (operator) {
            case "+":
                return plus(first, second);
            case "-":
                return minus(first, second);
            default:
                throw new ArithmeticException("unsupported operator");
        }
    }


    public static int plus(int first, int second) {
        return first + second;
    }

    public static int minus(int first, int second) {
        return first - second;
    }
}
