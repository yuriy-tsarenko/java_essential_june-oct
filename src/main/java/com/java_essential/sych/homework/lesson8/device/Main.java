package com.java_essential.sych.homework.lesson8.device;

public class Main {
    public static void main(String[] args) {
        Device device = new Device("Samsung", 120, "AB1234567CD ");
        Monitor monitor = new Monitor("Samsung", 120, "AB1234567CD", 1280, 1020);

        System.out.println(device);
        System.out.println(monitor);

    }

}
