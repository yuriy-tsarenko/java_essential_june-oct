package com.java_essential.kvirikadze.homework.lesson5.issue1;

import org.jetbrains.annotations.NotNull;

public class DocHandler extends AbstractHandler {

    public DocHandler(@NotNull String fileName) {
        super(fileName);
    }

    public void open() {
        System.out.format("DOC file %s is opened\n", getFileName());
    }

    public void create() {
        System.out.format("DOC file %s is created\n", getFileName());
    }

    public void change() {
        System.out.format("DOC file %s is changed\n", getFileName());
    }

    public void save() {
        System.out.format("DOC file %s is saved\n", getFileName());
    }

}
