package com.java_essential.safonov.homework.lesson7.Price;

public class Price {
    String productName;
    String nameOfShop;
    double price;

    public Price(String productName, String nameOfShop, double price) {
        this.productName = productName;
        this.nameOfShop = nameOfShop;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Price{"
                + "Название магазина ='" + nameOfShop + '\''
                + ", Название товара ='" + productName + '\''
                + ", Цена ='" + price + '\''
                + '}';
    }
}
