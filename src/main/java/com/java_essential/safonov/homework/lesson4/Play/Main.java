package com.java_essential.safonov.homework.lesson4.Play;

/*
Создайте 2 интерфейса Playable и Recodable.
В каждом из интерфейсов создайте по 3 метода void play() / void pause() / void stop()
и void record() / void pause() / void stop() соответственно. Создайте производный класс
Player от базовых интерфейсов Playable и Recodable. Написать программу, которая выполняет
проигрывание и запись.
 */
public class Main {
    public static void main(String[] args) {
        Player player = new Player();

        player.stop();
        player.play();
        player.pause();
        player.record();

    }
}
