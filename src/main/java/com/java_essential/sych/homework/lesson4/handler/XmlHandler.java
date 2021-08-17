package com.java_essential.sych.homework.lesson4.handler;

public class XmlHandler extends AbstractHandler {
    @Override
    void open() {
        System.out.println("Відкрити XML");
    }

    @Override
    void create() {
        System.out.println("Створити XML");
    }

    @Override
    void change() {
        System.out.println("Змінити XML");

    }

    @Override
    void save() {
        System.out.println("Зберегти XML");
    }
}
