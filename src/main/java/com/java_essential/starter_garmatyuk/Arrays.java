package com.java_essential.starter_garmatyuk;

class Arrays {
    /**
     * Задание 009_Arrays
     * Используя IntelliJ IDEA, создайте класс Arrays.
     * Создайте массив размерностью в 10 элементов, выведите на экран все элементы массива в обратном
     * порядке.
     */
    public static void main(String[] args) {
        int[] arrExam = new int[10];
        for (int i = 0; i < arrExam.length; i++) {
            arrExam[i] = i + 1;
        }

        for (int i = 0; i < arrExam.length; i++) {
            System.out.println(arrExam[arrExam.length - 1 - i]);
        }
        //System.out.println(java.util.Arrays.toString(arrExam));
    }
}
