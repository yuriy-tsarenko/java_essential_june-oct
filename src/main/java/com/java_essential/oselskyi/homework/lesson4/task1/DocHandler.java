package com.java_essential.oselskyi.homework.lesson4.task1;

public class DocHandler extends AbstractHandler {
    @Override
    void open() {
        System.out.println("doc open");
    }

    @Override
    void create() {
        System.out.println("doc create");
    }

    @Override
    void change() {
        System.out.println("doc change");
    }

    @Override
    void save() {
        System.out.println("doc save");
    }
}
