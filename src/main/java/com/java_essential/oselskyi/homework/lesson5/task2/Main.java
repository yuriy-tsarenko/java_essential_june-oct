package com.java_essential.oselskyi.homework.lesson5.task2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Создать класс Main, создать список целых чисел и используя ListIterator пройтись по списку и увеличить значения на 1;
 */
public class Main {

    public static void main(String[] args) {
        int i = 0;
        List<Integer> numbers = new ArrayList<>();
        numbers.add(4);
        numbers.add(2);
        numbers.add(8);
        numbers.add(10);
        numbers.add(5);
        numbers.add(16);
        System.out.println(numbers);
        Iterator<Integer> iter = numbers.listIterator();
        while (iter.hasNext()) {
            numbers.set(i, iter.next() + 1);
            i++;
        }
        System.out.println(numbers);
    }
}
