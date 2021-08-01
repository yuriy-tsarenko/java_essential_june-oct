package com.cbs.java_essential.examples.lesson6.nested_classes.ex001_nestedclasses;

/**
 * Вложенные классы.
 */
class MyClass {
    public MyClass() {
    }

    public class Nested {
        public Nested() {
        }

        private String field;

        public void method() {
            System.out.println("Метод из Nested класса" + field);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        MyClass.Nested instance = new MyClass().new Nested();
        instance.method();


        Demo demo = Demo.builder()
                .address("address")
                .value("sss")
                .email("@email")
                .build();

//        System.out.println(demo);
    }
}
