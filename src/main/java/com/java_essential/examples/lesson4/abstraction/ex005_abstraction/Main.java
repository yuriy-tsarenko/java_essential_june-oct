package com.java_essential.examples.lesson4.abstraction.ex005_abstraction;

public class Main {
    public static void main(String[] args) {
        AbstractBaseClass instance = new ConcreteDerivedClass();

        instance.simpleMethod();
        instance.abstractMethod();
    }
}
