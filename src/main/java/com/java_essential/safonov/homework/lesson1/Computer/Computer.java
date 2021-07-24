package com.java_essential.safonov.homework.lesson1.Computer;

public class Computer {
    int ip;

    public static void main(String[] args) {
        Computer[] computers = new Computer[5];

        computers[0] = new Computer();
        computers[1] = new Computer();
        computers[2] = new Computer();
        computers[3] = new Computer();
        computers[4] = new Computer();

        for (int i = 0; i < computers.length; i++) {
            computers[i].ip = i;
        }
            for(Computer comp : computers){
                System.out.println("IP адресс " + comp.ip);
            }
        }
    }

