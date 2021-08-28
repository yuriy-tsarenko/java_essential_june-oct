package com.java_essential.sych.homework.lesson4.player;

public class Main {
    public static void main(String[] args) {

        Playable play = new Player();
        Recodable record = new Player();

        play.play();
        play.pause();
        play.stop();
        System.out.println("~~~~~~~~~~~~~~~~~~");
        record.record();
        record.pause();
        record.stop();
    }
}
