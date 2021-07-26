package com.java_essential.safonov.homework.lesson3.DocumentWorker;

public class ExpertDocumentWorker extends  ProDocumentWorker{
    @Override
    public void saveDocument() {
        System.out.println("Документ сохранен в новом формате");
    }
}
