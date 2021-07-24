package com.java_essential.examples.lesson3.polymorphism.demo;

public class Bicycle implements Vehicle {
    @Override
    public String runEngine() {
        return "bicycle haven't engine";
    }
}
