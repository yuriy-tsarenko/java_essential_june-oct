package com.java_essential.oksiuta.homework.lesson1.task3;

public class Author {
    private String author;

    public Author(String author) {
        this.author = author;
    }

    public Author() {
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void show() {
        System.out.println(this.author);
    }
}
