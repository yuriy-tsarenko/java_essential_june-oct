package com.cbs.java_essential.examples.lesson6.nested_classes.ex002_nestedclasses;

public class Main {
    public static void main(String[] args) {
        MyClass.Nested instance = new MyClass().new Nested();
        instance.method(1);
    }
}
