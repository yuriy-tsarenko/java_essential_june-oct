package com.java_essential.baranovskyi.homework.lesson2.task3;
/*Задание 3
Используя IDEA, создайте проект c пакетом. Требуется: Создать класс Book(Main).
Создать классы Title, Author и Content, каждый из которых должен содержать одно строковое поле и метод void show ().
Реализуйте возможность добавления в книгу названия книги, имени автора и содержания.
Выведите на экран при помощи метода show() название книги, имя автора и Содержание.
*/
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
