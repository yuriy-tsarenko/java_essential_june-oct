package com.java_essential.starter_garmatyuk;

import java.util.Scanner;

public class Parity {
    /**
     * Задание 2 005_Logic
     * Известно, что у четных чисел младший бит имеет значение 0
     * Используя IntelliJ IDEA, создайте класс Parity.
     * Напишите программу, которая будет выполнять проверку чисел на четность.
     * Предложите два варианта решения поставленной задачи.
     */
    public static void main(String[] args) {
        int num;
        System.out.println("Введите число: ");
        Scanner input = new Scanner(System.in);
        num = input.nextInt();
        System.out.println("Ввидетие число еще раз для проверки через логическое 'И': ");
        int numLogic = input.nextInt();
        System.out.println("Ввидетие число и еще раз для проверки через Битовый сдвиг: ");
        int numBit = input.nextInt();

        isEvenMath(num);
        isEvenLogic(numLogic);
        isEvenBit(numBit);
    }

    protected static void isEvenMath(int a) {
        if (a % 2 == 0) {
            System.out.println(a + " Число четное");
        } else {
            System.out.println(a + " Число нечетное");
        }
    }

    protected static void isEvenLogic(int a) {
        String binA = Integer.toBinaryString(a);
        //char lastNum = binA.charAt(binA.length()-1);
        String result = binA.substring(binA.length() - 1);
        int b = Integer.parseInt(result);
        if ((b & 1) == 0) {
            System.out.println(a + " Число четное");
        } else {
            System.out.println(a + " Число нечетное");
        }
    }

    protected static void isEvenBit(int a) {
        int newBit = a >> 1;
        if (a == (newBit << 1)) {
            System.out.println(a + " Число четное");
        } else {
            System.out.println(a + " Число нечетное");
        }
    }

}
