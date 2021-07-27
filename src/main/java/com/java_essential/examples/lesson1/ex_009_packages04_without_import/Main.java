package com.java_essential.examples.lesson1.ex_009_packages04_without_import;

import java.util.Date;
//import java.sql.Date;

public class Main {
    public static void main(String[] args) {

        Date date = new Date();
        java.sql.Date date2 = new java.sql.Date(date.getTime());
        // можно сам импорт не писать, а указать полное имя класса, который нам надо использовать.

        com.java_essential.examples.lesson1.ex_004_method_calling.Car myCar =
                new com.java_essential.examples.lesson1.ex_004_method_calling.Car();
    }
}
