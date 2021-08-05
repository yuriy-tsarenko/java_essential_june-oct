package com.java_essential.oselskyi.homework.lesson4.task1;

public class XmlHandler extends AbstractHandler {
    @Override
    void open() {
        System.out.println("XML open");
    }

    @Override
    void create() {
        System.out.println("XML create");
    }

    @Override
    void change() {
        System.out.println("XML change");
    }

    @Override
    void save() {
        System.out.println("XML save");
    }
}
