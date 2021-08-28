package com.java_essential.sych.homework.lesson7.price;

import lombok.SneakyThrows;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    @SneakyThrows
    public static void main(String[] args) {
        Price[] prices = new Price[2];
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < prices.length; i++) {

            System.out.println("Enter Product name");
            String productName = b.readLine();
            System.out.println("Enter Store name");
            String storeName = b.readLine();
            System.out.println("Enter price");
            int price = Integer.parseInt(b.readLine());

            prices[i] = new Price(productName, storeName, price);
        }
        for (int i = 0; i < prices.length; i++) {
            System.out.println(prices[i].toString());
        }

        System.out.println("Введите название магазина ");
        String shopName = b.readLine();

        for (int i = 0; i < prices.length; i++) {
            String name = prices[i].storeName;

            if (shopName.equals(name)) {
                System.out.println(prices[i].toString());
            } else {
                throw new Exception();
            }
        }
    }
}
