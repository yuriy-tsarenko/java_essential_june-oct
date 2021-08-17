package com.java_essential.safonov.homework.lesson7.Worker;

public class Worker {
    String fio;
    String position;
    String year;

    public Worker(String fio, String position, String year) {
        this.fio = fio;
        this.position = position;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Worker{"
                + "ФИО ='" + fio + '\''
                + ", Должность ='" + position + '\''
                + ", Год поступления = " + year
                + '}';
    }
}
