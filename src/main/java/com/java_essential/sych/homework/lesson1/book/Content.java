package com.java_essential.sych.homework.lesson1.book;

public class Content {
    private String content;

    public Content(){

    }

    public Content(String content) {
        this.content = "поезія";
    }

    public void show() {
        System.out.println(content);
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
