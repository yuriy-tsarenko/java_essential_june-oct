package com.java_essential.sych.homework.lesson3.documentWorker;

public class ProDocumentWorker extends DocumentWorker {


    @Override
    void editDocument() {
        System.out.println("Документ отредактирован");
    }

    @Override
    void saveDocument() {
        System.out.println("Документ сохранен в старом формате,"
               + " сохранение в остальных форматах доступно в версии Эксперт ");

    }
}
