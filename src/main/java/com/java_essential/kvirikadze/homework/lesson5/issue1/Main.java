package com.java_essential.kvirikadze.homework.lesson5.issue1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String fileName = getFileName();
        AbstractHandler fileHandle;
        if (!FileFormatProvider.isRecognizedFileFormat(fileName)) {
            System.out.println("Формат файла не распознан!");
            System.exit(1);
        }
        if (FileFormatProvider.isDocFileFormat(fileName)) {
            fileHandle = new DocHandler(fileName);
        } else if (FileFormatProvider.isXmlFileFormat(fileName)) {
            fileHandle = new XmlHandler(fileName);
        } else {
            fileHandle = new TxtHandler(fileName);
        }
        fileHandle.create();
        fileHandle.open();
        fileHandle.change();
        fileHandle.save();
    }

    private static String getFileName() {
        System.out.println("Введите имя файла: ");
        return new Scanner(System.in).nextLine();
    }

}
