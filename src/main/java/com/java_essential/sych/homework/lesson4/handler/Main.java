package com.java_essential.sych.homework.lesson4.handler;

public class Main {
    public static void main(String[] args) {

        AbstractHandler xml = new XmlHandler();
        AbstractHandler txt = new TxtHandler();
        AbstractHandler doc = new DocHandler();

        xml.open();
        xml.create();
        xml.change();
        xml.save();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
        txt.open();
        txt.create();
        txt.change();
        txt.save();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
        doc.open();
        doc.create();
        doc.change();
        doc.save();
    }
}
