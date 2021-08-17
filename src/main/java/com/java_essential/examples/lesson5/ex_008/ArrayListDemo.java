package com.java_essential.examples.lesson5.ex_008;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

// Напишите метод, который добавляет 1_000_000 элементов в ArrayList.
// Напишите еще один метод, который выбирает из заполненного списка элемент наугад 100_000 раз.
// Замерьте время, которое потрачено на это. Сравните результаты и предположите, почему они именно такие.
public class ArrayListDemo {
    public static void main(String[] args) {
        Date startCreateList = printTimeStamp("Start createList");
        List<Integer> list = createList(50_000_000);
        System.out.printf("size: %d\n", list.size());
        Date endCreateList = printTimeStamp("End createList");
        printResult(startCreateList, endCreateList);

        Date startCreateListV2 = printTimeStamp("Start createListV2");
        List<Integer> list2 = createListV2(50_000_000);
        System.out.printf("size: %d\n", list2.size());
        Date endCreateListV2 = printTimeStamp("End createListV2");
        printResult(startCreateListV2, endCreateListV2);
    }

    public static List<Integer> createList(int size) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(new Random().nextInt(1000));
        }
        return list;
    }

    public static List<Integer> createListV2(int size) {
        List<Integer> list = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            list.add(new Random().nextInt(1000));
        }
        return list;
    }

    public static Date printTimeStamp(String taskType) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
        Date now = new Date();
        System.out.println("-----------------" + taskType + "-----------------------");
        System.out.println(dateFormat.format(now));
        System.out.println("-----------------" + taskType + "-----------------------");
        return now;
    }

    public static void printResult(Date start, Date end) {
        long startTime = start.getTime();
        long endTime = end.getTime();

        System.out.printf("time: %d milli seconds\n", endTime - startTime);
    }
}
