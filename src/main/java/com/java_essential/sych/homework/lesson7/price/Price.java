package com.java_essential.sych.homework.lesson7.price;

public class Price {
    private String productName;
    public String storeName;
    private int price;

    public Price(String productName, String storeName, int price) {
        this.productName = productName;
        this.storeName = storeName;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Price{"
                + "productName='" + productName + '\''
                + ", storeName='" + storeName + '\''
                + ", price=" + price
                + '}';
    }


}
