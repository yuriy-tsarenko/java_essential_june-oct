package com.java_essential.starter_garmatyuk;

import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        byte symbol = number.nextByte();

        //Проверка диапазона
        if (symbol < 0 || symbol > 100){
            System.out.println("Число не входит в промежуток от 0 до 100!");
        }
        //Диапозон
        if (symbol >= 0 && symbol <= 14){
            System.out.println("[0-14]");
        }else if
        (symbol >= 15 && symbol <= 35){
            System.out.println("[15-35]");
        }else if
        (symbol >= 36 && symbol <= 50){
            System.out.println("[36-50]");
        }else if
        (symbol >= 51 && symbol <= 100){
            System.out.println("[51-100]");
        }
    }
}
