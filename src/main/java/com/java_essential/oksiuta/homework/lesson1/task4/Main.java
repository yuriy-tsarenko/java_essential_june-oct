package com.java_essential.oksiuta.homework.lesson1.task4;

public class Main {
    public static void main(String[] args) {
        Computer[] computers = new Computer[5];

        for (int i = 0; i < computers.length; i++) {
            computers[i] = new Computer();
            computers[i].setPcId(i + 1);
        }

        for (Computer computer: computers) {
            System.out.println(computer);
        }

    }
}
