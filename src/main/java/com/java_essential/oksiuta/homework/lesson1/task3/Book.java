package com.java_essential.oksiuta.homework.lesson1.task3;

public class Book {
    public static void main(String[] args) {
        Author author = new Author("Lewis Carroll");
        Title title = new Title("Alice in Wonderland");
        Content content = new Content("Follow the white rabbit");

        author.show();
        title.show();
        content.show();

    }
}
