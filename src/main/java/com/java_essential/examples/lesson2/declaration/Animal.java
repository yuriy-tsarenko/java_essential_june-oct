package com.java_essential.examples.lesson2.declaration;

public class Animal {
    private int age;

    // объявление конструктора
    private Animal(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        Animal animal = new Animal(5);

        System.out.println(animal.getAge());
    }
}