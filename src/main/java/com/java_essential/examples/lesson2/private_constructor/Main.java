package com.java_essential.examples.lesson2.private_constructor;

public class Main {
    public static void main(String[] args) {
//         Компилятор нам не даст возможности создать объект с приватным консруктором
        Animal cat = Animal.of("Cat");
        Animal of = Animal.of(cat);
        System.out.println(cat);
        System.out.println(of);
    }
}