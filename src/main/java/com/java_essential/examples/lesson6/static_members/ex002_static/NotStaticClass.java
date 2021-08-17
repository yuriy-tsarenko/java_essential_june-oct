package com.cbs.java_essential.examples.lesson6.static_members.ex002_static;

public class NotStaticClass {
    static int id;
    private int value;

    // Конструктор.
    public NotStaticClass(int id, int value) {
        NotStaticClass.id = id;
        this.value = value;
    }

    public static void method() {
//        System.out.println("В статических методах нельзя обращаться к нестатическим полям.");
    }

    public void print() {
        System.out.printf("ID: %d VALUE: %d\n", id, value);
    }
}
