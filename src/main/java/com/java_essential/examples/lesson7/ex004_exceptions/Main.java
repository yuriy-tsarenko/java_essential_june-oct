package com.java_essential.examples.lesson7.ex004_exceptions;

import java.lang.Exception;

/**
 * Обработка исключений.
 */
class Demo {
    public void someWork() throws Exception {
        throw new Exception();
    }
}

class MyClass {
    public void myMethod() throws Exception {
        Demo demo = new Demo();
        demo.someWork();
    }

    public void myMethodTwo() {
        Demo demo = new Demo();
        try {
            demo.someWork();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

public class Main {
    public static void main(String[] args) throws Exception {
//        MyClass myClass = new MyClass();
//        myClass.myMethod();
//        myClass.myMethodTwo();
//        printMessage();
        int firstValue = 10;
        int secondValue = 0;
        try {
            double divide = divide(firstValue, secondValue);
            System.out.println(divide);
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
        double plus = plus(firstValue, secondValue);
        System.out.println(plus);

    }

    public static double plus(int firstValue, int secondValue) {
        return (double) firstValue + secondValue;
    }

    public static double divide(int firstValue, int secondValue) throws ArithmeticException {
        if (secondValue == 0) {
            throw new ArithmeticException("division by zero is forbidden");
        }
        return (double) firstValue / secondValue;
    }

    public static void printMessage() {
        System.out.println("Message!!!");
    }
}
