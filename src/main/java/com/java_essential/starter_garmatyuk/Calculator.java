package com.java_essential.starter_garmatyuk;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        int operand1 = 25;
        int operand2 = 0;

        int sign = 0;
        System.out.println("Введите знак арифметической операции.\n"
                + "Например: \nСложение + \nВычетание - \nУмножение * \nДеление / \nПолучить остаток от деления %");
        Scanner console = new Scanner(System.in);
        String symbol = console.nextLine();

        switch (symbol) {
            case "+" :  sign = operand1 + operand2;
                break;
            case "-":  sign = operand1 - operand2;
                break;
            case "*":  sign = operand1 * operand2;
                break;
            case "%":  if (operand2 == 0) {
                System.out.println("Любое число, кроме нуля!");
                break;
            }
                sign = operand1 % operand2;
                break;
            case "/":
                if (operand2 == 0) {
                    System.out.println("Любое число, кроме нуля!");
                break;
            }
                sign = operand1 / operand2;
                break;
            default:
                System.out.println("Неверный знак операции!");
                break;
        }
        System.out.println(sign);
    }

}
