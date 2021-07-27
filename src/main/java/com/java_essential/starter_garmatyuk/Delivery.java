package com.java_essential.starter_garmatyuk;

import java.util.Scanner;

public class Delivery {
    public static void main(String[] args) {
        System.out.println("Введите количество клиентов: ");
        Scanner console = new Scanner(System.in);
        int sumN = console.nextInt(); //количество клиентов
        System.out.println("Всего клиентов: " + sumN);

        int count = 1;
        int order = 1;
        do {
            order *= count;
            count++;

        } while (sumN >= count);
        System.out.println("Количество возможных вариантов доставки: " + order);
    }
}
