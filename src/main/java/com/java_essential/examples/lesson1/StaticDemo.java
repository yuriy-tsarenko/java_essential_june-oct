package com.java_essential.examples.lesson1;

public class StaticDemo {

    private String name;
    private String password;

    public StaticDemo() {
    }

    public StaticDemo(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public final void doSomeWork() {
        System.out.println("Hello");
    }

    protected void doSomeWork(Integer number) {
        System.out.println("Hello");
    }

    public static void doSomeWork(String message) {
        System.out.println("Hello" + message);
    }

    private static void doSomeWork(String message, int number) {
        System.out.printf("Hello: %s %d", message, number);
    }
}
