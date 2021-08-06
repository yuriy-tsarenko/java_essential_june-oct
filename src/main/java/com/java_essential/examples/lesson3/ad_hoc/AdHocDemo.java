package com.java_essential.examples.lesson3.ad_hoc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AdHocDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3));
        int v = 1;
        list.remove(v);
        System.out.println(list);

        List<Integer> list2 = new ArrayList<>(Arrays.asList(1, 2, 3));
        Integer v2 = 1;
        list2.remove(v2);
        System.out.println(list2);

        Mobile mobile = new Mobile();
        System.out.println(mobile.getTime());
        System.out.println(mobile.getTime("HH:mm"));
        System.out.println(mobile.getTime(4));
    }
}
