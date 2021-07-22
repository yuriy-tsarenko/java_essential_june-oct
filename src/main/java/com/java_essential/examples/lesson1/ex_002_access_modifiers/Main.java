package com.java_essential.examples.lesson1.ex_002_access_modifiers;

public class Main {
    public static void main(String[] args) {

        Car car = new Car();


        Shape shape = new Shape();

        shape.square = 24.0; // доступ к public полю
        System.out.println(shape.square);

        //задаем параметры нашему объекту

        shape.setHeight(200);
        long height = shape.getHeight();
        System.out.printf("height: %s\n", height);

        shape.setLength(144);
        int length = shape.getLength();
        System.out.printf("length: %s\n", length);

        // выводим объект через метод

        System.out.println(shape);
    }
}
