package com.java_essential.oselskyi.homework.lesson3.task3;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DocumentWorker worker;
        System.out.print("Введите ключ продукта: ");
        Scanner scanner = new Scanner(System.in);
        String key = scanner.nextLine();

        if (key.equals("PRO")) {
            worker = new ProDocumentWorker();

        } else if (key.equals("EXPERT")) {
            worker = new ExpertDocumentWorker();

        } else {
            System.out.println("\n" + "Неправильный ключ продукта!!!" + "\n");
            worker = new DocumentWorker();
        }


        worker.openDocument();
        worker.editDocument();
        worker.saveDocument();
    }
}
