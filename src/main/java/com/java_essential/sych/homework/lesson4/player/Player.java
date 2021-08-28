package com.java_essential.sych.homework.lesson4.player;

public class Player implements Playable, Recodable {
    @Override
    public void play() {
        System.out.println("Почати програвання");
    }

    @Override
    public void pause() {
        System.out.println("Pause");
    }

    @Override
    public void stop() {
        System.out.println("Stop");
    }

    @Override
    public void record() {
        System.out.println("Почати запис");
    }
}
