package com.cbs.java_essential.examples.lesson6.static_members.ex003_static_blocks;

/**
 * Статические блоки.
 * Статический блок вызывается, когда класс подгружается в память.
 */
public class NotStaticClass {
    public int nonStaticValue;
    public static int value;
    public static String token;

    {
        nonStaticValue = 15;
    }

    // Статический блок.
    static {
        value = 15;
        System.out.println("Static block static value = " + value);
    }

    public static void doSmth(String arg) {
        token = arg;
    }

    public NotStaticClass() {
        // X = 4; // Ошибка, так как статический блок вызывается раньше, чем конструктор.
        System.out.println("Constructor  static value = " + value);
        System.out.println("non static field" + nonStaticValue);
    }
}
