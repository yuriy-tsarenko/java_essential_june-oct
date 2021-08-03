package com.java_essential.baranovskyi.homework.lesson3.additional;

/**
Создать класс MyArea, в нем объявить константу PI = 3.14 и статический метод areaOfCircle,
который должен принимать радиус и используя PI посчитать площадь круга. Создать класс Main, где запустить данный метод.
*/

public class MyArea {
    static final double PI = 3.14;

    static double areaOfCircle(double radius) {
        return PI * radius * radius;
    }
}
