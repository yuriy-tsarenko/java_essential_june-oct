package com.java_essential.starter_garmatyuk;

import java.util.Scanner;

public class Premium {
    /**
     * Задание 4 005_Logic
     * Используя IntelliJ IDEA, создайте класс Premium.
     * Напишите программу расчета начисления премий сотрудникам. Премии рассчитываются согласно
     * выслуге лет.
     * Если выслуга до 5 лет, премия составляет 10% от заработной платы.
     * Если выслуга от 5 лет (включительно) до 10 лет, премия составляет 15% от заработной платы.
     * Если выслуга от 10 лет (включительно) до 15 лет, премия составляет 25% от заработной платы.
     * Если выслуга от 15 лет (включительно) до 20 лет, премия составляет 35% от заработной платы.
     * Если выслуга от 20 лет (включительно) до 25 лет, премия составляет 45% от заработной платы.
     * Если выслуга от 25 лет (включительно) и более, премия составляет 50% от заработной платы.
     * Результаты расчета, выведите на экран.
     */
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите оклад сотрудника: ");
        int salary = console.nextInt();
        System.out.println("Введите выслугу лет сотрудника: ");
        int experience = console.nextInt();
        isSeniorityEcho(experience);
        float salaryEnjoy = isAward(salary, isSeniority(experience));
        System.out.println("Зарплата сотрудника составила: " + salaryEnjoy);
    }


    protected static float isSeniority(int a) {
        float stuff = 0;
        if (a < 5) {
            stuff = 0.1F;
        } else if (a >= 5 && a <= 10) {
            stuff = 0.15F;
        } else if (a > 10 && a <= 15) {
            stuff = 0.25F;
        } else if (a > 15 && a <= 20) {
            stuff = 0.35F;
        } else if (a > 20 && a < 25) {
            stuff = 0.45F;
        } else if (a < 25) {
            stuff = 0.5F;
        }
        return stuff;
    }

    protected static void isSeniorityEcho(int a) {

        if (a < 5) {
            System.out.println("Премия сотрудника составила 10%");
        } else if (a >= 5 && a <= 10) {
            System.out.println("Премия сотрудника составила 15%");
        } else if (a > 10 && a <= 15) {
            System.out.println("Премия сотрудника составила 25%");
        } else if (a > 15 && a <= 20) {
            System.out.println("Премия сотрудника составила 35%");
        } else if (a > 20 && a < 25) {
            System.out.println("Премия сотрудника составила 45%");
        } else if (a < 25) {
            System.out.println("Премия сотрудника составила 50%");
        }
    }

    protected static float isAward(float a, float b) {
        return a + (a * b);
    }
}
