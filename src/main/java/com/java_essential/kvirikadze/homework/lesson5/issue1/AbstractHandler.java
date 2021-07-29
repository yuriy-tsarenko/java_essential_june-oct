package com.java_essential.kvirikadze.homework.lesson5.issue1;

import lombok.Getter;
import org.jetbrains.annotations.NotNull;

abstract class AbstractHandler {
    @Getter private String fileName;

    public AbstractHandler(@NotNull String fileName) {
        this.fileName = fileName;
    }

    public void open() {
    }

    public void create() {
    }

    public void change() {
    }

    public void save() {
    }

}
