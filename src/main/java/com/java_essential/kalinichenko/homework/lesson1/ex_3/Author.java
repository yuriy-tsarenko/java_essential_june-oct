package com.java_essential.kalinichenko.homework.lesson1.ex_3;

public class Author {
    String booksAuthor;

    public String getBooksAuthor() {
        return booksAuthor;
    }

    public void setBooksAuthor(String booksAuthor) {
        this.booksAuthor = booksAuthor;
    }

    public void show() {
        System.out.println(this.booksAuthor);
    }
}
