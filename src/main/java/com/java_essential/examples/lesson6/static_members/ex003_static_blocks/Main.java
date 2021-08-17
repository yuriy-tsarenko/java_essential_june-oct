package com.cbs.java_essential.examples.lesson6.static_members.ex003_static_blocks;

/**
 * Статические блоки.
 */
public class Main {
    public static void main(String[] args) {
        NotStaticClass.doSmth(args[0]);
        int value = NotStaticClass.value;
//        System.out.println(value);

        NotStaticClass instance = new NotStaticClass();
        System.out.println(instance.value);
        instance.value = 25;
    }
}
