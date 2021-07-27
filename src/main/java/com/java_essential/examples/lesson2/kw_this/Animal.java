package com.java_essential.examples.lesson2.kw_this;

public class Animal {
    private int age;
    private int height;

    // работа ключевого слова this
    public Animal(int age, int height) {
        this.age = age;
        this.height = height;
        someWork();
    }

    public void someWork() {
        // some code
    }
}