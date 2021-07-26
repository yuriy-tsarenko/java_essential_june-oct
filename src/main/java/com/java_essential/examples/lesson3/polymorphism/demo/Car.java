package com.java_essential.examples.lesson3.polymorphism.demo;

public class Car implements Vehicle {
    @Override
    public String runEngine() {
        return "Car works";
    }
}
