package com.java_essential.oselskyi.homework.lesson5.task1;

import java.util.ArrayList;
import java.util.List;

/**
 * 1)Создать класс Zoo. В классе создать список, в который записать 8 животных через метод add(index, element).
 * Вывести список в консоль.
 * 2)Используя класс Zoo Задания 2, удалить 3, 5, 7 животные, узнать размер списка и вывести в консоль.
 */
public class Zoo {
    String name;
    List<Zoo> zoo = new ArrayList<Zoo>();

    public Zoo(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Zoo zoo = new Zoo("park");
        zoo.addAnimal();
        zoo.deleteAnimal();
    }

    public void deleteAnimal() {
        zoo.remove(7);
        zoo.remove(5);
        zoo.remove(3);
        int size = zoo.size();
        System.out.println(size);
        System.out.println(zoo.toString());
    }

    public void addAnimal() {
        zoo.add(0, new Zoo("Веблюды"));
        zoo.add(1, new Zoo("Пеликаны"));
        zoo.add(2, new Zoo("Волки"));
        zoo.add(3, new Zoo("Слоны"));
        zoo.add(4, new Zoo("Львы"));
        zoo.add(5, new Zoo("Бегемоты"));
        zoo.add(6, new Zoo("Крокодилы"));
        zoo.add(7, new Zoo("Горилы"));
        System.out.println(zoo.toString());
    }

    @Override
    public String toString() {
        return "Zoo{"
                + "type=" + name
                + '}';
    }
}
