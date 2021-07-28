package com.java_essential.kvirikadze.homework.lesson3.issue3;

public class ProDocumentWorker extends DocumentWorker {

    @Override
    public void editDocument() {
        System.out.println("Документ отредактирован");
    }

    @Override
    public void saveDocument() {
        System.out.println("Документ сохранен в старом формате,\n"
                           + "сохранение в остальных форматах доступно в версии Эксперт");
    }

}
