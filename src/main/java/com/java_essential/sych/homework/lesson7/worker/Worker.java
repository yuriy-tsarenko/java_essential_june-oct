package com.java_essential.sych.homework.lesson7.worker;

public class Worker {
    public int employment;
    private String name;
    private String position;

    public Worker(String name, String position, int employment) {
        this.name = name;
        this.position = position;
        this.employment = employment;
    }

    @Override
    public String toString() {
        return "Worker{"
                + "name='" + name + '\''
                + ", position='" + position + '\''
                + ", employment=" + employment
                + '}';
    }

}
