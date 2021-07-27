package com.java_essential.safonov.homework.lesson3.DocumentWorker;

public class ProDocumentWorker extends DocumentWorker {

    @Override
    public void editDocument() {
        System.out.println("Документ отредактирован");
    }

    @Override
    public void saveDocument() {
        System.out.println("Документ сохранен в старом формате, сохранение доступно в версии Эксперт");
    }
}
