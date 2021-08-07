package com.java_essential.starter_garmatyuk;

import java.util.Scanner;

/**
 * Задание 3 008_Methods
 * Имеется N клиентов, которым компания производитель должна доставить товар. Сколько существует
 * возможных маршрутов доставки товара, с учетом того, что товар будет доставлять одна машина?
 * Используя IntelliJ IDEA, создайте класс Delivery.
 * Напишите программу, которая будет рассчитывать и выводить на экран количество возможных вариантов
 * доставки товара. Для решения задачи, используйте факториал N!, рассчитываемый с помощью рекурсии.
 * Объясните, почему не рекомендуется использовать рекурсию для расчета факториала. Укажите слабые
 * места данного подхода.
 */
public class DeliveryNew {
    public static void main(String[] args) {
        System.out.println("Введите количество клиентов: ");
        Scanner console = new Scanner(System.in);
        int result = destination(Integer.parseInt(console.nextLine()));
        System.out.println(result);
    }

    private static int destination(int a) {
        if (a == 1) return 1;
        return a * destination(a - 1);
    }

}
