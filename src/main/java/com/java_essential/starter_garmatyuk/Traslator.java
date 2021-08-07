package com.java_essential.starter_garmatyuk;

import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class Traslator {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите слово на русском языке:");
        String weather = console.next();

        switch (weather) {
            case "Холодная":
                System.out.println("Cold");
                break;
            case "Жаркая":
                System.out.println("Hot");
                break;
            case "Сухая":
                System.out.println("Dry");
                break;
            case "Дождливая":
                System.out.println("Rainy");
                break;
            case "Солнечная":
                System.out.println("Sunny");
                break;
            case "Облачная":
                System.out.println("Cloudy");
                break;
            case "Ветреная":
                System.out.println("Windy");
                break;
            case "Спокойная":
                System.out.println("Calm");
                break;
            default:
                System.out.println("Попробуйте еще раз...");
        }

    }
}
