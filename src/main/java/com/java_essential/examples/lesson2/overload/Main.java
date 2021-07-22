package com.java_essential.examples.lesson2.overload;

public class Main {
    public static void main(String[] args) {
        // создание обьектов с разными параметрами
        Animal animalDefault = new Animal();
        Animal animalWithOneParameter = new Animal(22);
        Animal animalWithTwoParameters = new Animal(23, 61);

        System.out.println(animalDefault);
        System.out.println(animalWithOneParameter);
        System.out.println(animalWithTwoParameters);

        // вывод параметров объеков
//        System.out.println("Age: " + animalDefault.getAge() + "; Height: " + animalDefault.getHeight());
//        System.out.println("Age: " + animalWithOneParameter.getAge() + "; Height: "
//        + animalWithOneParameter.getHeight());
//        System.out.println("Age: " + animalWithTwoParameters.getAge() + "; Height: "
//        + animalWithTwoParameters.getHeight());
    }
}