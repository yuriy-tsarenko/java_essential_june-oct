package com.java_essential.oselskyi.homework.lesson1.task3;

import java.util.Arrays;

/**
 * Используя IDEA, создайте проект с пакетом. Создать класс Computer, создать массив объектов Computers размером 5.
 * Далее руками создать 5 экземпляров этого класса и записать в созданный массив компьютеров (используя loop)
 */
public class Computer {

    public static void main(String[] args) {
        Computer[] computers = new Computer[5];
        for (int i = 0; i < computers.length; i++) {
            computers[i] = new Computer();

        }
        System.out.println(Arrays.toString(computers));



    }
}
