package com.java_essential.kalinichenko.homework.lesson1.ex_4;

public class Computer {
    int array;

    public static void main(String[] args) {
        Computer [] computer = new Computer[5];
        computer[0] = new Computer();
        computer[1] = new Computer();
        computer[2] = new Computer();
        computer[3] = new Computer();
        computer[4] = new Computer();

        for (int i = 0; i < computer.length; i++) {
            computer[i].array = (i + 1) * 2;
            System.out.print(computer[i].array + " ");
        }
    }
}
