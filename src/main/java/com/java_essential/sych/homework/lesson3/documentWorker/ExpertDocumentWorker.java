package com.java_essential.sych.homework.lesson3.documentWorker;

public class ExpertDocumentWorker extends ProDocumentWorker {

    @Override
    void saveDocument() {
        System.out.println("Документ сохранен в новом формате");
    }
}
