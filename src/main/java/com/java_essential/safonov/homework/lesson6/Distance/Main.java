package com.java_essential.safonov.homework.lesson6.Distance;
/*
Требуется: Создать класс Distance с полем distance типа double и методом print.
В классе Distance, создайте статический класс Converter с методами, которые будут
конвертировать расстояние в разные единицы измерения (к примеру, из метров в километры,
из километров в мили, и так далее).
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Distance distance = new Distance();
        Distance.Converter converter = new Distance.Converter();

        System.out.println("Введите единицу конвертации ");
        System.out.println(" 1 - мм в см ");
        System.out.println(" 2 - см в м");
        System.out.println(" 3 - м в км ");
        int value = scanner.nextInt();


        switch (value) {
            case (1):
                System.out.println("Введите длину ");
                value = scanner.nextInt();
                converter.from_MmOfSm(value);
                distance.print();
                break;
            case (2):
                System.out.println("Введите длину ");
                value = scanner.nextInt();
                converter.from_SmOfM(value);
                distance.print();
                break;
            case (3):
                System.out.println("Введите длину ");
                value = scanner.nextInt();
                converter.from_MOfKm(value);
                distance.print();
                break;
            default:
                System.out.println("Нет такого");
                break;
        }
    }

}

