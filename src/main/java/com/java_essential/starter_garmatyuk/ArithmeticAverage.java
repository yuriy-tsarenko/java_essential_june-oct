package com.java_essential.starter_garmatyuk;

public class ArithmeticAverage {
    public static void main(String[] args) {
        //Задание 1 003_Variables
        int x = 10, y = 12, z = 3;
        x += y - x++ * z;
        System.out.println(x);
        z = --x -y * 5;
        System.out.println(z);
        y /= x + 5 % z;
        System.out.println(y);
        z = x++ + y * 5;
        System.out.println(z);
        x = y - x++ * z;
        System.out.println(x);

        //Задание 2 003_Variables
        System.out.println("Задание 2 \n");
        double keyOne = 2, keyTwo = 4, keyThree = 1;
        double result = (keyOne + keyTwo + keyThree)/3;
        System.out.println("Результат без плавающей точки: " + (int) result);
        System.out.println("Результат с плавающей точкой: " + result);
        System.out.println("Мы столкнулись с потерей точности (потерей данных), поэтому нужно использовать " +
                "double для большей точности в вычислениях.");
    }
}
