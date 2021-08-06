package com.java_essential.sych.homework.lesson1.book;

public class Author {
    private String author;

    public Author() {

    }

    public Author(String author) {
        this.author = "Тарас Шевченко";
    }

    public void show() {
        System.out.println(author);
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
