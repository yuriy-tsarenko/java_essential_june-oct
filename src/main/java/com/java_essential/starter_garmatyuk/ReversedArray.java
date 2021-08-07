package com.java_essential.starter_garmatyuk;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * Задание 3
 * Используя IntelliJ IDEA, создайте класс ReversedArray.
 * Требуется:
 * 1) Создать метод myReverse(int [] array), который принимает в качестве аргумента массив
 * целочисленных элементов и возвращает инвертированный массив (элементы массива в обратном
 * порядке).
 * 2) Создайте метод int [] subArray(int [] array, int index, int count). Метод возвращает
 * часть полученного в качестве аргумента массива, начиная с позиции указанной в аргументе index,
 * размерностью, которая соответствует значению аргумента count.
 * Если аргумент count содержит значение больше чем количество элементов, которые входят в
 * выбираемую часть исходного массива (от указанного индекса index, до индекса последнего элемента),
 * то при формировании нового массива размерностью в count, заполните единицами те элементы,
 * которые не были скопированы из исходного массива.
 */
public class ReversedArray {
    private static int[] myReverse(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        return array;
    }

    private static int[] subArray(int[] array, int index, int count) {
        int[] result = new int[count];
        for (int i = 0; i < result.length; i++) {
            result[i] = (i + index < array.length) ? array[index + i] : 1;
        }
        return result;

    }
}