package com.java_essential.starter_garmatyuk;

import java.util.Scanner;

public class DeMorganComparison {

    public static void main(String[] args) {
        System.out.println("Введите два двоичных числа");
        Scanner console = new Scanner(System.in);
        String numA = console.nextLine();
        String numB = console.nextLine();
        System.out.println(disjunction(numA, numB));
    }

    static String disjunction(String a, String b) {
        StringBuilder result = new StringBuilder();
        int countA = a.length() - 1;
        int countB = b.length() - 1;
        while (countA >= 0 || countB >= 0) {
            char tempA = (countA >= 0) ? a.charAt(countA--) : '0';
            char tempB = (countB >= 0) ? b.charAt(countB--) : '0';
            result.append(isAdd(tempA, tempB));
        }
        return result.reverse().toString();
    }

    static char isAdd(char a, char b) {
        if (a == '1' && b == '1') {
            return '1';
        } else if (a == '0' && b == '1') {
            return '1';
        } else if (a == '1' && b == '0') {
            return '1';
        } else {
            return '0';
        }
    }


}
