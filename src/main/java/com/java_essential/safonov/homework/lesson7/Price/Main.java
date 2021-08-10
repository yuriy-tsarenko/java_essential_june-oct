package com.java_essential.safonov.homework.lesson7.Price;
/*
Требуется: Описать класс с именем Price, содержащую следующие поля:
 название товара;
 название магазина, в котором продается товар;
 стоимость товара в гривнах.
Написать программу, выполняющую следующие действия:
ввод с клавиатуры данных в массив, состоящий из двух элементов типа Price
(записи должны быть упорядочены в алфавитном порядке по названиям магазинов);
вывод на экран информации о товарах, продающихся в магазине, название
которого введено с клавиатуры (если такого магазина нет, вывести исключение).

 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        Price[] price = new Price[3];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < price.length; i++) {
            System.out.println("Название товара ");
            String productName = br.readLine();
            System.out.println("Название магазина ");
            String nameOfShop = br.readLine();
            System.out.println("Цена товара ");
            double pr = Double.parseDouble(br.readLine());

            price[i] = new Price(productName, nameOfShop, pr);
        }
        for (int i = 0; i < price.length; i++) {
            System.out.println(price[i].toString());
        }

        System.out.println("Введите название магазина ");
        String shopName = br.readLine();

        for (int i = 0; i < price.length; i++) {
            String name = price[i].nameOfShop;

            if (shopName.equals(name)) {
                System.out.println(price[i].toString());
            } else {
                throw new Exception();
            }
        }
    }
}
