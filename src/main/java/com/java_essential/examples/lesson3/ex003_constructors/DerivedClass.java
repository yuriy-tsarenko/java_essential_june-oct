package com.java_essential.examples.lesson3.ex003_constructors;

/**
 * Наследование.
 */
public class DerivedClass extends BaseClass {
    public int derivedField;

    // Конструктор по умолчанию.
    //public DerivedClass()
    //{
    //}

    // Пользовательский конструктор.
    // При создании объекта производного класса, конструктор производного класса
    // автоматически вызывает конструктор по умолчанию из базового класса.
    // Конструктор базового класса, присвоит всем данным какие-то свои безопасные значения.
    // После этого начнет работу конструктор производного класса, который повторно
    // будет определять значения для унаследованых членов. (ДВОЙНАЯ РАБОТА)!
    public DerivedClass(int number1, int number2) {
        super(number1);
        // Инициализируем поле базового класса.

        baseNumber = number1;
        // Инициализируем поле производного (данного) класса.
        derivedField = number2;
    }

    public DerivedClass(int number1, int number2, double number3) {
        // Инициализируем поля базового класса.
        super(number3, number1);
    // альтернатива вызову конструктора базового класа
    //        super.baseNumber2 = number3;
    //        super.baseNumber = number1;

        // Инициализируем поле производного (данного) класса.
        derivedField = number2;
    }
}
