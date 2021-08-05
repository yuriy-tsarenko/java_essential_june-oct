package com.java_essential.oselskyi.homework.lesson4.task1;

import java.util.Scanner;

/**
 * Создайте класс AbstractHandler.
 * В теле класса создать методы void open(), void create(), void change(), void save().
 * Создать производные классы XMLHandler, TXTHandler, DOCHandler от базового класса AbstractHandler.
 * Написать программу, которая будет выполнять определение документа и для каждого формата должны быть методы
 * открытия, создания, редактирования, сохранения определенного формата документа.
 */
public class AbstractHandler {
    public static final String XML = "xml";
    public static final String TXT = "txt";
    public static final String DOC = "doc";

    public static AbstractHandler chooseFormat() {
        AbstractHandler handler = null;
        System.out.println("Введите формат документа: (txt/xml/doc)");
        Scanner scanner = new Scanner(System.in);
        String format = scanner.nextLine();
        switch (format) {
            case "txt":
                handler = new TxtHandler();
                break;
            case "xml":
                handler = new XmlHandler();
                break;
            case "doc":
                handler = new DocHandler();
                break;
            default:
                System.out.println("Формат введен неверно");
        }
        return handler;
    }

    public void printFormat() {
        open();
        create();
        change();
        save();
    }

    void open() {
        System.out.println("open");

    }

    void create() {
        System.out.println("create");

    }

    void change() {
        System.out.println("change");

    }

    void save() {
        System.out.println("save");

    }

}
