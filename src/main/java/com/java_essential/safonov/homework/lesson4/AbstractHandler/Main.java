package com.java_essential.safonov.homework.lesson4.AbstractHandler;

/*
Создайте класс AbstractHandler.
В теле класса создать методы void open(), void create(), void change(), void save().
Создать производные классы XMLHandler, TXTHandler, DOCHandler от базового класса AbstractHandler.
Написать программу, которая будет выполнять определение документа и для каждого формата должны быть
методы открытия, создания, редактирования, сохранения определенного формата документа.
 */
public class Main {
    public static void main(String[] args) {
        AbstractHandler xml = new XmlHandler();
        AbstractHandler txt = new TxtHandler();
        AbstractHandler doc = new DocHandler();

        xml.open();
        xml.change();
        xml.save();
        xml.create();
        System.out.println("------------------");
        txt.open();
        txt.change();
        txt.save();
        txt.create();
        System.out.println("------------------");
        doc.open();
        doc.change();
        doc.save();
        doc.create();
        System.out.println("------------------");
    }
}
