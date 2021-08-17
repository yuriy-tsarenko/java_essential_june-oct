package com.java_essential.examples.lesson8.example;

import lombok.Setter;

import java.util.Objects;

@Setter
public class Bike {
    private int id;
    private String name;
    private Vehicle vehicle;

    public Bike(int id, String name, Vehicle vehicle) {
        this.id = id;
        this.name = name;
        this.vehicle = vehicle;
    }

    @Override
    public int hashCode() {
        int hash = 11;
        hash = 83 * hash + Objects.hashCode(this.id);
        hash = 83 * hash + Objects.hashCode(this.name);
        hash = 83 * hash + Objects.hashCode(this.vehicle);
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
        final Bike other = (Bike) obj;

        //сравниваем вложенные поля
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }

        if (!Objects.equals(this.name, other.name)) {
            return false;
        }

        if (!Objects.equals(this.vehicle, other.vehicle)) {
            return false;
        }

        //если все проверки успешны тогда обьекты одинаковы
        return true;
    }

    @Override
    public String toString() {
        return "Bike{"
                + "id=" + id
                + ", name='" + name + '\''
                + ", vehicle='" + vehicle + '\''
                + '}';
    }
}
