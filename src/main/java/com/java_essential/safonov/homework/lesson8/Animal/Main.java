package com.java_essential.safonov.homework.lesson8.Animal;

/*
Дополнительное задание:
Создать класс Animal с именем String, возрастом int, хвостом Boolean.
В классе переопределить метод toString, что бы вывод был сдедующим «Имя: Кеша, возраст: 1, хвост: true».
 В классе Animal переопределить методы equals & hashCode.
 */
public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Кеша", 1, true);
        System.out.println(animal);
        System.out.println(animal.hashCode());
    }
}
