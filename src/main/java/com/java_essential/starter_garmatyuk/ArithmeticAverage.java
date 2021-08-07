package com.java_essential.starter_garmatyuk;

public class ArithmeticAverage {
    public static void main(String[] args) {
        //Задание 1 003_Variables
        int exampleX = 10;
        int exampleY = 12;
        int exampleZ = 3;
        exampleX += exampleY - exampleX++ * exampleZ;
        System.out.println(exampleX);
        exampleZ = --exampleX - exampleY * 5;
        System.out.println(exampleZ);
        exampleY /= exampleX + 5 % exampleZ;
        System.out.println(exampleY);
        exampleZ = exampleX++ + exampleY * 5;
        System.out.println(exampleZ);
        exampleX = exampleY - exampleX++ * exampleZ;
        System.out.println(exampleX);

        //Задание 2 003_Variables
        System.out.println("Задание 2 \n");
        double keyOne = 2;
        double keyTwo = 4;
        double keyThree = 1;
        double result = (keyOne + keyTwo + keyThree) / 3;
        System.out.println("Результат без плавающей точки: " + (int) result);
        System.out.println("Результат с плавающей точкой: " + result);
        System.out.println("Мы столкнулись с потерей точности (потерей данных), поэтому нужно использовать "
                + "double для большей точности в вычислениях.");
    }
}
