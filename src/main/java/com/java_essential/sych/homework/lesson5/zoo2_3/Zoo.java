package com.java_essential.sych.homework.lesson5.zoo2_3;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    public static void main(String[] args) {


        List<String> arrayList = new ArrayList<>();

        arrayList.add(0, "Owl");
        arrayList.add(1, "Lion");
        arrayList.add(2, "Cobra");
        arrayList.add(3, "Swallow");
        arrayList.add(4, "Sparrow");
        arrayList.add(5, "Wolf");
        arrayList.add(6, "Bear");
        arrayList.add(7, "Whale");

        System.out.println(arrayList);

        arrayList.remove(7);
        arrayList.remove(5);
        arrayList.remove(3);


        System.out.println(arrayList);
        System.out.println(arrayList.size());
    }
}
