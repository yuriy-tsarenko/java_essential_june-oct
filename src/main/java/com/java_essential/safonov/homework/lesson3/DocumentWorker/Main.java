package com.java_essential.safonov.homework.lesson3.DocumentWorker;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int pro = 1;
        int exp = 2;
        int key;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ключ доступа 1 - Про , 2 - Expert");

        key = scanner.nextInt();

        if (key == pro){
            DocumentWorker proDocumentWorker = new ProDocumentWorker();
            proDocumentWorker.openDocument();
            proDocumentWorker.editDocument();
            proDocumentWorker.saveDocument();
        }else if(key == exp){
            DocumentWorker expertDocumentWorker = new ExpertDocumentWorker();
            expertDocumentWorker.openDocument();
            expertDocumentWorker.editDocument();
            expertDocumentWorker.saveDocument();

        }else{
            DocumentWorker documentWorker = new DocumentWorker();
            documentWorker.openDocument();
            documentWorker.editDocument();
            documentWorker.saveDocument();
            System.out.println("Бесплатная версия");
        }


    }
}
