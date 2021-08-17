package com.java_essential.sych.homework.lesson4.handler;

public class TxtHandler extends AbstractHandler {
    @Override
    void open() {
        System.out.println("Відкрити TXT");
    }

    @Override
    void create() {
        System.out.println("Створити TXT");
    }

    @Override
    void change() {
        System.out.println("Змінити TXT");

    }

    @Override
    void save() {
        System.out.println("Зберегти TXT");

    }


}
