package com.java_essential.examples.lesson3.ex008_interface_inheritance;

/**
 * Наследование.
 */
public class SomeClass implements SomeInterface {
    // Поля

    // Открытое поле
    public String publicField = "publicField";

    // Метод
    @Override
    public void method() {
        System.out.println("method.SomeClass");
    }
}
