package com.java_essential.oksiuta.homework.lesson1.additional;

public class Main {
    public static void main(String[] args) {

        Address postOffice = new Address();

        postOffice.setIndex("01001");
        postOffice.setCountry("Ukraine");
        postOffice.setCity("Kyiv");
        postOffice.setStreet("Khreshchatyk");
        postOffice.setHouse("22");
        postOffice.setApartment("1");

        System.out.println(postOffice);
    }
}
