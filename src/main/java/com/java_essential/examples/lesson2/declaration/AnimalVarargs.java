package com.java_essential.examples.lesson2.declaration;

import java.util.Arrays;

public class AnimalVarargs {
    private int[] age;

    // объявление конструктора
    private AnimalVarargs(int... age) {
        this.age = age;
    }

    public int[] getAge() {
        return age;
    }

    public static void main(String[] args) {
        AnimalVarargs animal = new AnimalVarargs(4, 3, 5, 6, 7, 8);
        AnimalVarargs animalTwo = new AnimalVarargs(3, 6, 8);
        AnimalVarargs animalThree = new AnimalVarargs();

        System.out.println(Arrays.toString(animal.getAge()));
    }
}