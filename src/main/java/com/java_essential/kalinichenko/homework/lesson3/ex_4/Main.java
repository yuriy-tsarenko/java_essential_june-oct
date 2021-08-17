package com.java_essential.kalinichenko.homework.lesson3.ex_4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите ключ: ");
        Scanner sc = new Scanner(System.in);
        String key = sc.next();

        switch (key) {
            case "123456": {
                DocumentWorker proDocument = new ProDocumentWorker();
                proDocument.openDocument();
                proDocument.editDocument();
                proDocument.saveDocument();
                break;
            }
            case "999999":  {
                DocumentWorker expertDocument = new ExpertDocumentWorker();
                expertDocument.openDocument();
                expertDocument.editDocument();
                expertDocument.saveDocument();
                break;
            }
            default: {
                DocumentWorker documentWorker = new DocumentWorker();
                documentWorker.openDocument();
                documentWorker.editDocument();
                documentWorker.saveDocument();
                break;
            }
        }
    }
}
