package com.java_essential.safonov.homework.lesson7.Worker;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.time.Year;
/*
Задание 2
Требуется: Описать класс с именем Worker, содержащую следующие поля:
 фамилия и инициалы работника;
 название занимаемой должности;
 год поступления на работу.
Написать программу, выполняющую следующие действия:
ввод с клавиатуры данных в массив, состоящий из пяти элементов типа Worker (записи должны быть упорядочены по алфавиту);
если значение года введено не в соответствующем формате выдает исключение.
вывод на экран фамилии работника, стаж работы которого превышает введенное значение.
 */

public class Main {
    public static void main(String[] args) throws IOException, ParseException {

        DateValid dateValid = new DateValid();
        Worker[] workers = new Worker[4];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        for (int i = 0; i < workers.length; i++) {
            String fio;
            String post;
            String year;
            System.out.println("ФИО = ");
            fio = br.readLine();
            System.out.println("Должность = ");
            post = br.readLine();
            System.out.println("Год = ");
            year = br.readLine();

            dateValid.dateVolidate(year, "yyyy");

            workers[i] = new Worker(fio, post, year);
        }
        System.out.println("Введите стаж  = ");
        int value = Integer.parseInt(br.readLine());

        int yearNow = Year.now().getValue();

        for (int i = 0; i < workers.length; i++) {

            String year = workers[i].year;

            int staj = yearNow - Integer.parseInt(year);

            if (staj > value) {
                System.out.println(workers[i].toString());
            }
        }

    }
}
