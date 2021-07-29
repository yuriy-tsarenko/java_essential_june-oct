package com.java_essential.kvirikadze.homework.lesson5.issue1;

import org.jetbrains.annotations.NotNull;

public class XmlHandler extends AbstractHandler {

    public XmlHandler(@NotNull String fileName) {
        super(fileName);
    }

    public void open() {
        System.out.format("XML file %s is opened\n", getFileName());
    }

    public void create() {
        System.out.format("XML file %s is created\n", getFileName());
    }

    public void change() {
        System.out.format("XML file %s is changed\n", getFileName());
    }

    public void save() {
        System.out.format("XML file %s is saved\n", getFileName());
    }

}
