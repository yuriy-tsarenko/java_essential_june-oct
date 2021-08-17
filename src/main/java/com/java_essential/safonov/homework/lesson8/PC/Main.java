package com.java_essential.safonov.homework.lesson8.PC;

/*
Задание 3
Смотреть задание 2. В обоих классах переопределить метод toString, что бы вывод был следующим:
Device: manufacturer =Samsung, price=120, serialNumber=AB1234567CD Monitor: manufacturer =Samsung, price=120,
serialNumber=AB1234567CD, X=1280,Y=1024
Задание 4
 Смотреть задание 2. Переопределить методы equals & hashCode в каждом классе.
Создать класс Main, в котором создать объекты классов и продемонстрировать переопределенные методы.
 */
public class Main {
    public static void main(String[] args) {
        Device device = new Device("Samsung", 120, "AB1234567CD");
        Monitor monitor = new Monitor("Samsung", 120, "AB1234567CD", 1280, 1020);

        System.out.println(device);
        System.out.println(monitor);

        System.out.println(device.equals(monitor));
        System.out.println(monitor.hashCode());
        System.out.println(device.hashCode());
    }
}
