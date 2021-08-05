package com.java_essential.oselskyi.homework.lesson4.task1;

public class Main {
    public static void main(String[] args) {
        AbstractHandler handler = AbstractHandler.chooseFormat();
        handler.printFormat();
    }
}
