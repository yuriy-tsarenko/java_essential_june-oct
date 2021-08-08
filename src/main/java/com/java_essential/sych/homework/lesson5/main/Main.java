package com.java_essential.sych.homework.lesson5.main;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        List<Integer> someNumbers = new ArrayList<>();

        for (int i = 0; i < 15; i++) {
            someNumbers.add(i);
        }

        for (Integer temp :
                someNumbers) {
            System.out.println(temp);
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");

        ListIterator<Integer> value = someNumbers.listIterator();
        while (value.hasNext()) {
            Integer val = value.next() + 1;
            System.out.println(val);
        }
    }

}

