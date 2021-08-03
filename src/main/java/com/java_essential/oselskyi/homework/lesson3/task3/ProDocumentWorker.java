package com.java_essential.oselskyi.homework.lesson3.task3;

public class ProDocumentWorker extends DocumentWorker {

    @Override
    void editDocument() {
        System.out.println("Документ отредактирован");
    }

    @Override
    void saveDocument() {
        System.out.println("Документ сохранен в старом формате, "
                + "сохранение в остальных форматах доступно в версии Эксперт");
    }
}
