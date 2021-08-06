package com.java_essential.oselskyi.homework.lesson1.task2;

public class Author {
    private String author;

    public void show() {
        System.out.println("Автор книги - " + author);
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
