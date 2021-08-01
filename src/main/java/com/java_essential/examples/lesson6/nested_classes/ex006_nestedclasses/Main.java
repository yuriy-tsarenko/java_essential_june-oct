package com.cbs.java_essential.examples.lesson6.nested_classes.ex006_nestedclasses;

/**
 * Вложенные классы.
 * Классы могут в себе содержать статические Nested классы.
 */
class MyClass {
    public static class Nested {

        public Nested() {
        }

        public void print() {
            System.out.println("instance");
        }

        public static void staticMethodFromNested() {
            System.out.println("Статический метод Nested класса.");
        }

    }
}

public class Main {
    public static void main(String[] args) {
        MyClass.Nested.staticMethodFromNested();

        MyClass.Nested nested = new MyClass.Nested();
        nested.print();
    }
}
