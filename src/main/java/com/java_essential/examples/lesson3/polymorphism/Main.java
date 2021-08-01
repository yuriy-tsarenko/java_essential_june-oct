package com.java_essential.examples.lesson3.polymorphism;

public class Main {
    public static void main(String[] args) {
        ChildOne childOne = new ChildOne();
        ChildTwo childTwo = new ChildTwo();

        Parent[] parents = {childOne, childTwo};

        for (Parent parent : parents) {
            System.out.println(parent.getName());
        }

        execute(childOne);
        execute(childTwo);
    }

    public static void execute(Parent object) {
        System.out.println(object.getName());
    }
}
