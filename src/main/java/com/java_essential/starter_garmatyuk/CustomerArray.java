package com.java_essential.starter_garmatyuk;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Arrays;

/**
 * Задание 2 009_Arrays
 * Используя IntelliJ IDEA, создайте класс CustomerArray.
 * Требуется:
 * Создать массив размера N элементов, заполнить его произвольными целыми значениями (размер
 * массива задает пользователь).
 * Вывести на экран: наибольшее значение массива, наименьшее значение массива, общую сумму всех
 * элементов, среднее арифметическое всех элементов, вывести все нечетные значения.
 */
public class CustomerArray {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int inputCustomer = Integer.parseInt(console.nextLine());
        int[] array = generateArr(inputCustomer);
        System.out.println("Все элементы массива: " + Arrays.toString(array));
        System.out.println("Значение максимального элемента равно: " + maxArrValue(array));
        System.out.println("Значение минимального элемента равно: " + minArrValue(array));
        System.out.println("Сумма всех элементов массива равна: " + sumArrElem(array));
        System.out.println("Среднее арифметическое всех элементов равно: " + midArithmeticArr(array));
        System.out.println("Все нечетные элементы: " + oddArrElem(array));


    }

    private static int[] generateArr(int lengthArray) {
        int[] arrCustomer = new int[lengthArray];
        for (int i = 0; i < arrCustomer.length; i++) {
            arrCustomer[i] = (int) (Math.random() * 100);
        }
        return arrCustomer;
    }

    private static int maxArrValue(int[] array) {
        int max = array[0];
        for (int j : array) {
            if (j > max) {
                max = j;
            }
        }
        return max;

    }

    private static int minArrValue(int[] array) {
        int min = array[0];
        for (int j : array) {
            if (j < min) {
                min = j;
            }
        }
        return min;
    }

    private static int sumArrElem(int[] array) {
        int sum = 0;
        for (int j : array) {
            sum += j;
        }
        return sum;
    }

    private static int midArithmeticArr(int[] array) {
        return sumArrElem(array) / array.length;
    }

    private static List<Integer> oddArrElem(int[] array) {
        List<Integer> odd = new ArrayList<>();
        for (int j : array) {
            if (j % 2 == 1) {
                odd.add(j);
            }
        }
        return odd;
    }
}
