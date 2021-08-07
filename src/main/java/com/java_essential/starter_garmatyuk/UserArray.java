package com.java_essential.starter_garmatyuk;

/**
 * Задание 4 009_Array
 * Используя IntelliJ IDEA, создайте класс UserArray.
 * Требуется:
 * Создать метод, который будет выполнять увеличение длины массива переданного в качестве аргумента,
 * на 1 элемент. Элементы массива, должны сохранить свое значение и порядок индексов.
 * Создайте метод, который принимает два аргумента, первый аргумент – типа int [] array, второй
 * аргумент – типа int value. В теле метода реализуйте возможность добавления второго аргумента
 * метода в массив по индексу 0, при этом длина нового массива, должна увеличиться на 1 элемент, а
 * элементы получаемого массива в качестве первого аргумента должны скопироваться в новый массив
 * начиная с индекса 1.
 */
public class UserArray {
    private static int[] increaseArray(int[] array) {
        int[] result = new int[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            result[i] = array[i];
        }
        return result;
    }

    private static int[] addElement(int[] array, int value) {
        int[] result = new int[array.length + 1];
        result[0] = value;
        for (int i = 0; i < array.length; i++) {
            result[i + 1] = array[i];
        }
        return result;
    }
}
