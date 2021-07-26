package com.java_essential.examples.lesson3.ex009_interface_inheritance;

/**
 * Наследование.
 */
public abstract class SomeClass implements SomeInterface3, SomeInterface2, SomeInterface1 {

    @Override
    public void method1() {
        //some code
        System.out.println("SomeClass.method1");
    }

    @Override
    public void method2() {
        //some code
        System.out.println("SomeClass.method2");
    }
}
