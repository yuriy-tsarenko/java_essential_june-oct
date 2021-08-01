package com.java_essential.examples.lesson6.anonymous.ex002_anonymous_classes;

import java.util.List;

/**
 * Анонимные классы.
 */
interface Parent {
    void method();
}

public class Main {
    public static void main(String[] args) {
        // Объявление анонимного (внутреннего) класса
        Parent instance = new Parent() {
            public double doubleValue = 1.3;
            protected String str = "Anonymous class";
            private int num = 10;

            @Override
            public void method() {
                num = 1234;
                System.out.println("instance1: d = " + doubleValue + ", str = " + str + ", num = " + num);
            }

        };

        Parent instance2 = new Parent() {
            public double doubleValue = 1.32;
            protected String str = "Anonymous class2";
            private int num = 22;

            @Override
            public void method() {
                num = 1234;
                System.out.println("instance2: d = " + doubleValue + ", str = " + str + ", num = " + num);
            }

        };
        List<Parent> list = List.of(instance, instance2);
        list.forEach(inst -> inst.method());
//        instance.method();
        // Поле не доступно
        //System.out.println(instance.d);
    }
}
