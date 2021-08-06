package com.java_essential.safonov.homework.lesson5;

import java.util.ArrayList;
import java.util.List;
/*
Задание 2
Создать класс Zoo. В классе создать список, в который записать 8
животных через метод add(index, element). Вывести список в консоль.

 */

public class Zoo {
    public static void main(String[] args) {
        int num;
        List<String> animals = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            animals.add(i, "Zoo " + i);
        }
        for (Object zoo : animals) {
            System.out.print(zoo + " ");
        }
        System.out.println("\n-----------------------");
        // Удаление из листа по индексу
        animals.remove(3);
        animals.remove(5);
        animals.remove(7);

        System.out.println(animals);
        //---Размер листа
        num = animals.size();
        System.out.println("Размер после удаления " + num);
    }
}

