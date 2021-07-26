package com.java_essential.examples.lesson2.private_constructor;

public class Animal {
    public void setAnimal(String animal) {
        this.animal = animal;
    }

    public String getAnimal() {
        return animal;
    }

    private String animal;

    // объявленный конструктор является приватным. Может быть использован только в рамках данного класса
    private Animal(Object other) {
        if (other instanceof Animal) {
            this.animal = ((Animal) other).getAnimal();
        } else {
            this.animal = other.toString();
        }
    }


    public static Animal of(Object other) {
        return new Animal(other);
    }

    @Override
    public String toString() {
        return "Animal{"
                + "animal='" + animal + '\''
                + '}';
    }
}