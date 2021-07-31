package com.java_essential.starter_garmatyuk;

import java.util.Scanner;

/**
 * Задание 2 008_Methods
 * Используя IntelliJ IDEA, создайте класс Bank.
 * Представьте, что вы реализуете программу для банка, которая помогает определить, погасил ли клиент
 * кредит или нет. Допустим, ежемесячная сумма платежа должна составлять 100 грн. Клиент должен
 * выполнить 7 платежей, но может платить реже большими суммами. Т.е., может двумя платежами по 300
 * и 400 грн. Закрыть весь долг.
 * Создайте метод, который будет в качестве аргумента принимать сумму платежа, введенную экономистом
 * банка. Метод выводит на экран информацию о состоянии кредита (сумма задолженности, сумма
 * переплаты, сообщение об отсутствии долга).
 */
public class Bank {
    int sumCredit;
    int monthCredit;
    int balance;
    String name;

    public Bank(int sumCredit, int monthCredit, int balance, String name) {
        this.sumCredit = sumCredit;
        this.monthCredit = monthCredit;
        this.balance = balance;
        this.name = name;
    }

    public void statusCredit(int a) {
        int overBalance = (this.balance > this.sumCredit) ? (this.balance - this.sumCredit) : 0;
        System.out.println("Имя клиента: " + this.name + "\n Сумма задолжности: " + (this.sumCredit - this.balance)
                + "\n Сумма переплаты: " + overBalance);
        if (overBalance > 0) {
            System.out.println("Долгов нет");
        }
    }

    public void setBalance(int balance) {
        this.balance += balance;
    }

    public static void main(String[] args) {
        Bank creditOne = new Bank(10000, 10, 0, "Ivan");


        System.out.println("Введите сумму платежа:");
        Scanner console = new Scanner(System.in);
        int inputSumPayment = Integer.parseInt(console.nextLine());
        creditOne.setBalance(inputSumPayment);
        creditOne.statusCredit(inputSumPayment);


    }


}
