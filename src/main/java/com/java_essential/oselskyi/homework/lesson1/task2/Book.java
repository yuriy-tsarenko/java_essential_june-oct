package com.java_essential.oselskyi.homework.lesson1.task2;

public class Book {
    public static void main(String[] args) {
        Author author = new Author();
        Content content = new Content();
        Title title = new Title();

        author.setAuthor("Извесный автор");
        content.setContent("Разнообразный интересный контент");
        title.setTitle("Очень интересная книга");


        author.show();
        title.show();
        content.show();
    }
}
