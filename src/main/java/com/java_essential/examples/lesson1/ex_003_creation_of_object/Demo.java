package com.java_essential.examples.lesson1.ex_003_creation_of_object;

public class Demo extends com.java_essential.examples.lesson1.ex_002_access_modifiers.Car {

    public void someWork() {
        System.out.println(super.maxSpeed);
    }

    public static void main(String[] args) {
        Car car = new Car();
    }
}
