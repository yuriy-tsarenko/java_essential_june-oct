package com.java_essential.baranovskyi.homework.lesson2.task4;

public class Computer {
    private String computer1;

    public static void main(String[] args) {
        Computer[] computer = new Computer[5];
        computer[0] = new Computer();
        computer[1] = new Computer();
        computer[2] = new Computer();
        computer[3] = new Computer();
        computer[4] = new Computer();

        for (int a = 0; a < 5; a++) {
            computer[a].computer1 = "com_" + a;
        }

        for (Computer com : computer) {
            System.out.println("Computer -> " + com.computer1);
        }
    }
}
