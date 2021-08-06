package com.java_essential.examples.lesson8.ex_002_class_object_methods;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(160, "blue");

        Class<Car> carClass = Car.class;
        System.out.println(carClass.getName());
        System.out.println(carClass.getPackage().getName());
        System.out.println(carClass.getSimpleName());

        // благодар¤ перезаписаному методу toString выведет информацию в нужном нам виде
        System.out.println(car);
    }
}
