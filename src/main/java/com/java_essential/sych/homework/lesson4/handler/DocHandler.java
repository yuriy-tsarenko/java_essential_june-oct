package com.java_essential.sych.homework.lesson4.handler;

public class DocHandler extends AbstractHandler {
    @Override
    void open() {
        System.out.println("Відкрити DOC");
    }

    @Override
    void create() {
        System.out.println("Створити DOC");
    }

    @Override
    void change() {
        System.out.println("Змінити DOC");

    }

    @Override
    void save() {
        System.out.println("Зберегти DOC");

    }
}
