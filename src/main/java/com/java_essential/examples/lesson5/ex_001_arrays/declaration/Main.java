package com.java_essential.examples.lesson5.ex_001_arrays.declaration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // объявление массива
        int[] arr1;
//        int arr2[]; // не рекоммендуется
        arr1 = new int[5]; // объявили размерность в 5 элементов
        int[] arr3 = new int[100];

        int[] arr4 = {12, 25, 33, 41, 13, 98}; // размер массива 6

        System.out.println(arr4.length); //  длинна массива
        List<Integer> integers = Arrays.asList(12, 25, 33, 41, 13, 98);

        Object[] objects = integers.toArray();

        Integer[] integers2 = integers.toArray(new Integer[]{});

        System.out.println(Arrays.toString(objects));

        Object[] arrayObj = new Object[]{12, "www", objects};
        System.out.println(Arrays.deepToString(arrayObj));
        System.out.println(Arrays.toString(arrayObj));

        List<Parent> parentList = new ArrayList<>();
        Child child = new Child();
        ChildTwo childTwo = new ChildTwo();

        parentList.add(child);
        parentList.add(childTwo);
    }
}
