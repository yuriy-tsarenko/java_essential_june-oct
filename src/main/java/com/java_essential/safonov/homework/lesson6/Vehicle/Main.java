package com.java_essential.safonov.homework.lesson6.Vehicle;

/*
Задание 2
Требуется: Создать класс Vehicle с методом print.
В классе Vehicle, создайте внутренний класс Wheel и Door,
которые также должны содержать метод print. Создайте экземпляры классов Wheel и Door.
 */
public class Main {
    public static void main(String[] args) {
        Vehicle.Wheel wheel = new Vehicle().new Wheel();
        Vehicle.Door door = new Vehicle().new Door();

        wheel.print();
        door.print();
    }
}
