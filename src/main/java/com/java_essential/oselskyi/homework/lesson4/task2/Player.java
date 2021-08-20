package com.java_essential.oselskyi.homework.lesson4.task2;

import java.util.Scanner;

public class Player implements Playable, Recordable {
    boolean recorder = false;
    boolean player = false;
    boolean pause = false;
    Scanner scanner = new Scanner(System.in);

    public void run() {

        System.out.println("Введите действие которое нужно совершить"
                + "  для того чтобы открыть инструкцию введите: 'tips'");
        String action = scanner.nextLine();
        switch (action) {
            case ("tips"):
                showInstruction();
                break;
            case ("record"):
                record();
                break;
            case ("player"):
                play();
                break;
            default:
                System.out.println("Введена неверная команда");
                run();
        }
    }

    void showInstruction() {
        System.out.println("для того чтобы выбрать проигрыватель введите 'player'" + "\n"
                + "чтобы выбрать диктофон введите 'record'" + "\n"
                + "чтобы приостановить запись или проигрывание введите 'pause'" + "\n"
                + "для остановки записи или проигрывания введите 'stop'" + "\n"
                + "для возобновления либо включения введите 'play'");
        System.out.println("Введите действие которое нужно совершить");
        String action2 = scanner.nextLine();
        if (action2.equals("record")) {
            record();
        } else if (action2.equals("player")) {
            play();
        }
    }

    @Override
    public void play() {
        if (pause) {
            System.out.println("Музыка продолжает играть");
            pause = false;
        } else {
            System.out.println(" Музыка играет");
        }
        String action3 = scanner.nextLine();
        player = true;
        if (action3.equals("pause")) {
            pause();
        } else if (action3.equals("stop")) {
            stop();
        }
    }

    @Override
    public void record() {
        if (pause) {
            System.out.println("Запись продолжается");
            pause = false;
        } else {
            System.out.println(" Звук записывается");
        }
        String action3 = scanner.nextLine();
        recorder = true;
        if (action3.equals("pause")) {
            pause();
        } else if (action3.equals("stop")) {
            stop();
        }
    }

    @Override
    public void pause() {
        pause = true;
        if (player) {
            System.out.println(" Музыка приостановлена");
            String action = scanner.nextLine();
            if (action.equals("play")) {
                play();
            }
        } else if (recorder) {
            System.out.println(" Запись приостановлена");
            String action = scanner.nextLine();
            if (action.equals("record")) {
                record();
            }
        }

    }

    @Override
    public void stop() {
        if (player) {
            System.out.println(" Музыка остановлена");
            String action = scanner.nextLine();
            player = false;
            if (action.equals("play")) {
                play();
            } else if (action.equals("record")) {
                record();
            }
        } else if (recorder) {
            System.out.println(" Запись остановлена");
            String action = scanner.nextLine();
            recorder = false;
            if (action.equals("record")) {
                record();
            } else if (action.equals("play")) {
                play();
            }
        }

    }
}
