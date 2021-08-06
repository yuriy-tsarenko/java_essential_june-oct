package com.java_essential.safonov.homework.lesson4.AbstractHandler;

public class XmlHandler extends AbstractHandler {
    @Override
    void open() {
        System.out.println("Открыть XML");
    }

    @Override
    void create() {
        System.out.println("Создать XML");

    }

    @Override
    void change() {
        System.out.println("Изменить XML");

    }

    @Override
    void save() {
        System.out.println("Созранить XML");

    }
}
