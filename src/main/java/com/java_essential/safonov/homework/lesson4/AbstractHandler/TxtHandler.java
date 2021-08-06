package com.java_essential.safonov.homework.lesson4.AbstractHandler;

public class TxtHandler extends AbstractHandler {
    @Override
    void open() {
        System.out.println("Открыть TXT");
    }

    @Override
    void create() {
        System.out.println("Создать TXT");

    }

    @Override
    void change() {
        System.out.println("Изменить TXT");

    }

    @Override
    void save() {
        System.out.println("Сохранить TXT");
    }
}
