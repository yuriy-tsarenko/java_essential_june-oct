package com.cbs.java_essential.examples.lesson6.static_members.ex002_static;

/**
 * В статических методах нельзя обращаться к нестатическим полям.
 */
public class Main {
    public static void main(String[] args) {
        NotStaticClass instance = new NotStaticClass(1, 115);
        instance.print();
        NotStaticClass instance2 = new NotStaticClass(15, 120);
        instance.print();
        instance2.print();
//        NotStaticClass.Method();
    }
}
