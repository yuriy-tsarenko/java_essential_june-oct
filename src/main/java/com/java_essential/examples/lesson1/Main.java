package com.java_essential.examples.lesson1;

public class Main {
    public static void main(String[] args) {
        StaticDemo demo = new StaticDemo();
        demo.doSomeWork();
        StaticDemo.doSomeWork("message");

    }
}
