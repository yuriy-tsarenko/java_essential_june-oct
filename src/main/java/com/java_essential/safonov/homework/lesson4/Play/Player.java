package com.java_essential.safonov.homework.lesson4.Play;

public class Player implements IPlayable, IRecodable {
    @Override
    public void play() {
        System.out.println("Включить музыку");

    }

    @Override
    public void record() {
        System.out.println("Записать музыку");

    }

    @Override
    public void pause() {
        System.out.println("Поставить на паузу");

    }

    @Override
    public void stop() {
        System.out.println("Остановить музыку");

    }
}
