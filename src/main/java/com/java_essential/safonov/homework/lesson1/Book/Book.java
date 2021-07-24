package com.java_essential.safonov.homework.lesson1.Book;

import java.util.Scanner;

public class Book {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Content content = new Content();
        Author author = new Author();
        Title title = new Title();
        System.out.println("Введите название книги ");
        title.setTitle(scanner.nextLine());
        System.out.println("Введите автора книги ");
        author.setAuthor(scanner.nextLine());
        System.out.println("Введите содержание \n");
        content.setContent(scanner.nextLine());

        System.out.println("Наша книга: ");
        System.out.print("Автор "); author.show();
        System.out.print("Название "); title.show();
        System.out.print("Содержание "); content.show();






    }
}
