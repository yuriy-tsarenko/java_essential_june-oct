package com.java_essential.oselskyi.homework.lesson2.task1;

/**
 * Создать класс Машина с полями год(int), цвет(String).
 * Создать конструктор по умолчанию, конструктор с одним и 2-я параметрами.
 * Создать класс Main в котором создать экземпляры вызывая разные конструкторы.
 */
public class Car {
    int year;
    String color;

    public Car() {
    }

    public Car(int year) {
        this.year = year;
    }

    public Car(int year, String color) {
        this.year = year;
        this.color = color;
    }
}
