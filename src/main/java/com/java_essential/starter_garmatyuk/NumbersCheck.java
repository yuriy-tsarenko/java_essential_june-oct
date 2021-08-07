package com.java_essential.starter_garmatyuk;

import java.util.Scanner;

public class NumbersCheck {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int key = console.nextInt();
        NumbersCheck numbersCheck = new NumbersCheck();

        System.out.println("Число больше нуля " + numbersCheck.determiner(key));
        System.out.println("Число простое " + numbersCheck.checkNumber(key));
        System.out.println("Число делится на 2 5 3 6 9 " + numbersCheck.divided25369(key));
    }

    private boolean determiner(int k) {
        return k > 0;
    }

    private boolean checkNumber(int k) {
        for (int i = 2; i < k; i++) {
            if (k % i == 0) {
                return false;
            }
        }
        return true;
    }

    private boolean divided25369(int k) {
        return k % 5 == 0 && k % 6 == 0 && k % 9 == 0;
    }
}
