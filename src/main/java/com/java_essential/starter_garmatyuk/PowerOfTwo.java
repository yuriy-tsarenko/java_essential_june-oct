package com.java_essential.starter_garmatyuk;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int power = console.nextInt();

        System.out.println("Данное число является степенью 2: " + isPow2(power));
    }

    static boolean isPow2(int a) {
        int result = 2;
        while (result != a) {
            result = result << 1;
            if (result > a) {
                return false;
            }
        }
        return true;


    }
}
