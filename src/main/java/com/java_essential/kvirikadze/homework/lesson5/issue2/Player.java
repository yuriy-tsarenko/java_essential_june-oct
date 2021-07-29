package com.java_essential.kvirikadze.homework.lesson5.issue2;

public class Player implements Playable, Recordable {
    private boolean recordStarted = false;
    private boolean recordPaused = false;
    private boolean playStarted = false;
    private boolean playPaused = false;

    @Override
    public void record() {
        if ((recordStarted) && (recordPaused)) {
            recordPaused = false;
            System.out.println("Recording is resumed");
        } else {
            stop();
            recordStarted = true;
            System.out.println("Recording is started");
        }
    }

    @Override
    public void play() {
        if ((playStarted) && (playPaused)) {
            playPaused = false;
            System.out.println("Playing is resumed");
        } else {
            stop();
            playStarted = true;
            System.out.println("Playing is started");
        }
    }

    @Override
    public void pause() {
        if (playStarted) {
            playPaused = true;
            System.out.println("Playing is paused");
        }
        if (recordStarted) {
            recordPaused = true;
            System.out.println("Recording is paused");
        }
    }

    @Override
    public void stop() {
        if ((playStarted) || (playPaused)) {
            playPaused = false;
            playStarted = false;
            System.out.println("Playing is stopped");
        }
        if ((recordStarted) || (recordPaused)) {
            recordPaused = false;
            recordStarted = false;
            System.out.println("Recording is stopped");
        }

    }
}
