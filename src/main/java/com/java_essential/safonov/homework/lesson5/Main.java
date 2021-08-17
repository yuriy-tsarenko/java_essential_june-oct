package com.java_essential.safonov.homework.lesson5;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/*
Задание 4
Создать класс Main, создать список целых чисел и используя ListIterator
 пройтись по списку и увеличить значения на 1;
 */
public class Main {
    public static void main(String[] args) {
        List<Integer> number = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            number.add(i);
        }
        for (Object o : number) {
            System.out.print(o + " ");
        }
        System.out.println("\nИтерируем По листу увечиваетм на 1");
        ListIterator<Integer> value = number.listIterator();

        while (value.hasNext()) {
            Integer val = value.next() + 1;
            System.out.print(val + " ");
        }


    }
}
