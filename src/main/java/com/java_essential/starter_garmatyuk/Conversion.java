package com.java_essential.starter_garmatyuk;

import java.util.Scanner;

public class Conversion {
    public static void main(String[] args) {
        Scanner initiate = new Scanner(System.in);
        System.out.println("Добро пожаловать в Валютный калькулятор! \n"
                + "Введите сумму денег в определенной валюте \n"
                + "Затем актуальный курс \n");
        double currency = Double.parseDouble(initiate.nextLine());
        double exchange = Double.parseDouble(initiate.nextLine());

        Conversion conversion = new Conversion();
        conversion.procedure(currency, exchange);
    }

    private void procedure(double a, double b) {
        double result = a * b;
        String s = String.format("\t %,.2f", result);

        System.out.println("Курс валют:" + s + " у.е.");
    }
}
