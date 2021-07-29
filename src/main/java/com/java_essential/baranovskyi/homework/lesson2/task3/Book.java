package com.java_essential.baranovskyi.homework.lesson2.task3;

import java.util.Scanner;

public class Book {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Title title = new Title();
        Author author = new Author();
        Content content = new Content();

        System.out.println("Введите название книги: ");
        title.setTitle(sc.next());
        System.out.println("Введите имя автора книги: ");
        author.setAuthor(sc.next());
        System.out.println("Введите содержание книги: ");
        content.setContent(sc.next());

        title.show();
        author.show();
        content.show();
    }
}
