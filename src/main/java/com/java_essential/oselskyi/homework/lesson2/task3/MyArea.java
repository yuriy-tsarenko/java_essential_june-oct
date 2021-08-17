package com.java_essential.oselskyi.homework.lesson2.task3;

/**
 * Создать класс MyArea, в нем объявить константу PI = 3.14 и статический метод areaOfCircle,
 * который должен принимать радиус и используя PI посчитать площадь круга.
 * Создать класс Main, где запустить данный метод.
 */
public class MyArea {
    public static final double PI = 3.14;

    public static double areaOfCircle(double radius) {
        double area = radius * radius * PI;
        return area;
    }
}
