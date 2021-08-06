package com.java_essential.examples.lesson8.example;

import java.util.Objects;

public class Vehicle {
    private int id;
    private String name;

    public Vehicle(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.id);
        hash = 83 * hash + Objects.hashCode(this.name);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        //проверяем ссылку на обьект
        if (this == obj) {
            return true;
        }

        //проверяем на null
        if (obj == null) {
            return false;
        }

        //проверяем одинаковы ли типы классов
        if (getClass() != obj.getClass()) {
            return false;
        }

        //casting
        final Vehicle other = (Vehicle) obj;

        //сравниваем вложенные поля
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }

        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        //если все проверки успешны тогда обьекты одинаковы
        return true;
    }

    @Override
    public String toString() {
        return "Vehicle{"
                + "id=" + id
                + ", name='" + name + '\''
                + '}';
    }
}
