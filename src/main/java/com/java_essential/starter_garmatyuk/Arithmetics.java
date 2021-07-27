package com.java_essential.starter_garmatyuk;

import java.util.Scanner;

public class Arithmetics {
    public static void main(String[] args) {

        Scanner keyWord = new Scanner(System.in);
        System.out.println("Добро пожаловать в обновленный Калькулятор! \n"
                + "Ведите сначала первое целлочисленное значение, затем введите знак арифметической операции \n"
                + "После чего, введите второе целое число \n"
                + "Приятного пользования!");
        int operand1 = Integer.parseInt(keyWord.nextLine());
        String operation = keyWord.nextLine();
        int operand2 = Integer.parseInt(keyWord.nextLine());
        Arithmetics arithmetics = new Arithmetics();

        switch (operation) {
            case "+":
                arithmetics.add(operand1, operand2);
                break;
            case "-":
                arithmetics.sub(operand1, operand2);
                break;
            case "*":
                arithmetics.mul(operand1, operand2);
                break;
            case "/":
                arithmetics.div(operand1, operand2);
                break;
            default:
                System.out.println("Неверный знак операции!");
                break;
        }
    }

    private void add(int a, int b) {
        System.out.println(a + b);
    }

    private void sub(int a, int b) {
        System.out.println(a - b);
    }

    private void mul(int a, int b) {
        System.out.println(a * b);
    }

    private void div(int a, int b) {
        if (b == 0) {
            System.out.println("На ноль делить нельзя");
            return;
        }
        System.out.println((double) a / b);
    }


}


