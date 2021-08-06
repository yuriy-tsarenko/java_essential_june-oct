package com.java_essential.kalinichenko.homework.lesson1.ex_1;

public class Main {
    public static void main(String[] args) {
        Address address = new Address();

        address.setIndex(13169);
        int index = address.getIndex();
//        System.out.println("Индекс: " + index);

        address.setCountry("Украина");
        String country = address.getCountry();
//        System.out.println("Страна: " + country);

        address.setCity("Киев");
        String city = address.getCity();
//        System.out.println("Город: " + city);

        address.setStreet("Межигорская");
        String street = address.getStreet();
//        System.out.println("Улица: " + street);

        address.setHouse(11);
        int house = address.getHouse();
//        System.out.println("Дом: " + house);

        address.setApartment("422");
        String apartment = address.getApartment();
//        System.out.println("Квартира: " + apartment);

        System.out.println("Индекс: " + index
                + "\nСтрана: " + country
                + "\nГород: " + city
                + "\nУлица: " + street
                + "\nДом: " + house
                + "\nКвартира: " + apartment);
    }
}
