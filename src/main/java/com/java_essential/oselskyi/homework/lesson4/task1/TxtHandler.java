package com.java_essential.oselskyi.homework.lesson4.task1;

public class TxtHandler extends AbstractHandler {
    @Override
    void open() {
        System.out.println("txt open");
    }

    @Override
    void create() {
        System.out.println("txt create");
    }

    @Override
    void change() {
        System.out.println("txt change");
    }

    @Override
    void save() {
        System.out.println("txt save");
    }
}
