package com.java_essential.safonov.homework.lesson8.PC;

import java.util.Objects;

/*
Задание 2
Создать классы: 1) Основной класс Device (manufacturer(String), price(float), serialNumber(String));
2) Сабласс Monitor (resolutionX(int), resolutionY(int)) and EthernetAdapter (speed (int), mac (String));
Добавить методы доступа. Конструктор.
 */
public class Device {
    String manufacturer;
    float price;
    String serialNumber;

    public Device(String manufacturer, float price, String serialNumber) {
        this.manufacturer = manufacturer;
        this.price = price;
        this.serialNumber = serialNumber;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public float getPrice() {
        return price;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    @Override
    public String toString() {
        return "Device: " + "manufacturer= "
                + manufacturer
                + ", price= " + price
                + ", serialNumber= " + serialNumber;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.manufacturer);
        hash = 83 * hash + Objects.hashCode(this.price);
        hash = 83 * hash + Objects.hashCode(this.serialNumber);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null) {
            return false;
        }

        if (this.getClass() != obj.getClass()) {
            return false;
        }

        final Device other = (Device) obj;

        if (!Objects.equals(this.manufacturer, other.manufacturer)) {
            return false;
        }

        if (!Objects.equals(this.price, other.price)) {
            return false;
        }
        if (!Objects.equals(this.serialNumber, other.serialNumber)) {
            return false;
        }
        return true;
    }
}
