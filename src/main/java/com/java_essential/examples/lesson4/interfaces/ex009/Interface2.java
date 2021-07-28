package com.java_essential.examples.lesson4.interfaces.ex009;

public interface Interface2 {

    void someWork();

    default void task() {
        System.out.println("Interface2");
    }
}
