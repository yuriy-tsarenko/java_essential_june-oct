package com.java_essential.oselskyi.homework.lesson3.task3;

public class ExpertDocumentWorker extends ProDocumentWorker {
    @Override
    void saveDocument() {
        System.out.println("Документ сохранен в новом формате");
    }
}
