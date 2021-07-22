package com.java_essential.examples.lesson2;

public class Main {
    public static void main(String[] args) {
        Computer[] computers = new Computer[5];
        for (int i = 0; i < computers.length; i++) {
            int id = i + 1;
            computers[i] = new Computer(id, "Asus HWR-" + id);
        }

        for (Computer computer : computers) {
            System.out.println(computer);
        }

    }
}