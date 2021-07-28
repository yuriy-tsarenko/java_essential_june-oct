package com.java_essential.examples.lesson4.interfaces.ex009;

public class DemoClass implements Interface1, Interface2 {

    @Override
    public void someWork() {

    }

    @Override
    public void task() {
        Interface1.super.task();
    }
}
