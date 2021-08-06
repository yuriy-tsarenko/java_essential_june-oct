package com.java_essential.sych.homework.lesson1.book;

public class Book {
    public static void main(String[] args) {
        Title title = new Title("Кобзар");
        Author author = new Author("Тарас Шевченко");
        Content content = new Content("поезія");
        title.show();
        author.show();
        content.show();
    }


}
