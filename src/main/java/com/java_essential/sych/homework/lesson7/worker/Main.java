package com.java_essential.sych.homework.lesson7.worker;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.Year;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Worker[] workers = new Worker[5];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < workers.length; i++) {
            String name;
            String position;
            int employment;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter name");
            name = sc.nextLine();
            System.out.println("Enter position");
            position = sc.nextLine();
            System.out.println("Enter year of joining");
            employment = sc.nextInt();
            if (employment == 0) {
                try {
                    throw new IOException();
                } catch (IOException e) {
                    System.out.println("The date was entered incorrectly");
                    System.out.println("Enter year of joining again");
                    employment = sc.nextInt();

                }
            }
            workers[i] = new Worker(name, position, employment);
        }
        System.out.println("Enter work experience");
        int value = Integer.parseInt(br.readLine());
        int yearNow = Year.now().getValue();

        for (int i = 0; i < workers.length; i++) {
            int year = workers[i].employment;

            int staj = yearNow - Integer.parseInt(String.valueOf(year));

            if (staj > value) {
                System.out.println(workers[i].toString());
            }
        }
    }
}
