package com.java_essential.safonov.homework.lesson1.Address;

public class Main {
    public static void main(String[] args) {
        Address address = new Address();

        address.setIndex("100745");
        address.setCity("Kazan");
        address.setCountry("Russia");
        address.setStreet("Ibragimova");
        address.setHouse("56");
        address.setApartment("10");

        System.out.println(address.toString());

    }
}

