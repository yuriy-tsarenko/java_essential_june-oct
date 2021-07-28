package com.java_essential.safonov.homework.lesson4.AbstractHandler;

public class DocHandler extends AbstractHandler {
    @Override
    void open() {
        System.out.println("Открыть DOC");
    }

    @Override
    void create() {
        System.out.println("Создать DOC");

    }

    @Override
    void change() {
        System.out.println("Изменить DOC");

    }

    @Override
    void save() {
        System.out.println("Сохранить DOC");

    }
}
