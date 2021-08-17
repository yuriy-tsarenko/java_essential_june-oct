package com.java_essential.examples.lesson5.ex_003_arrays.dimensional;

public class Main {
    public static void main(String[] args) {
        // объявление массива массивов
        int[][] arr = {
                {10, 15},
                {31, 44, 99, 56},
                {65, 12, 42},
                {}
        };
        System.out.printf("количество строк масива: %d\n", arr.length);

        for (int i = 0; i < arr.length; i++) {
            System.out.printf("строка #%d, количество елементов: %d\n", i + 1, arr[i].length);
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("%d ", arr[i][j]);
            }
            System.out.println();
        }
    }
}
