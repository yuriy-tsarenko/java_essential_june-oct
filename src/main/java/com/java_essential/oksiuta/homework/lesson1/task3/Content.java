package com.java_essential.oksiuta.homework.lesson1.task3;

public class Content {
    private String content;

    public Content(String content) {
        this.content = content;
    }

    public Content() {
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void show() {
        System.out.println(this.content);
    }
}
