package com.java_essential.starter_garmatyuk;

public class MachineMathematics {
    public static void main(String[] args) {
        //Задание 1
        System.out.println("Задание 1");
        byte a = Byte.MIN_VALUE;
        byte a1 = Byte.MAX_VALUE; // -128 ... +127
        short b = Short.MIN_VALUE;
        short b1 = Short.MAX_VALUE; // -32,768 ... 32,767
        int i = Integer.MIN_VALUE;
        int i1 = Integer.MAX_VALUE; // -2_147_483_648 ... 2_147_483_647
        long l = Long.MIN_VALUE;
        long l1 = Long.MAX_VALUE;
        boolean bool = Boolean.FALSE;
        boolean bool1 = Boolean.TRUE;
        double d = Double.MIN_VALUE;
        double d1 = Double.MAX_VALUE;
        float f = Float.MIN_VALUE;
        float f1 = Float.MAX_VALUE;
        char c = '\u0000';
        System.out.println("Тип данных byte имеет минимальное " + a + " и максимальное значение " + a1);
        System.out.println("Тип данных short имеет минимальное " + b + " и максимальное значение " + b1);
        System.out.println("Тип данных int имеет минимальное " + i + " и максимальное значение " + i1);
        System.out.println("Тип данных long имеет минимальное " + l + " и максимальное значение " + l1);
        System.out.println("Тип данных boolean имеет минимальное " + bool + " и максимальное значение " + bool1);
        System.out.println("Тип данных double имеет минимальное " + d + " и максимальное значение " + d1);
        System.out.println("Тип данных float имеет минимальное " + f + " и максимальное значение " + f1);
        System.out.println("Тип данных char имеет минимальное " + c + " и максимальное значение 65536");

        //Задание 2
        System.out.println("*=*=*=*=*=*=*=*=*=*=");
        System.out.println("Задание 2");
        double pi = Math.PI;
        System.out.println("Число 'Пи' равно: " + pi);
        double e = Math.E;
        System.out.println("Число 'Эллера' равно: " + e);

        //Задание 3
        System.out.println("*=*=*=*=*=*=*=*=*=*=");
        System.out.println("Задание 3");
        String str1 = "\nмоя строка 1";
        String str2 = "\tмоя строка 2";
        //String str3 = "\aмоя строка 3";
        System.out.println(str1);
        System.out.println(str2);
        //System.out.println(str3);

        /*Дополнительное задание
        System.out.println("*=*=*=*=*=*=*=*=*=*=");
        System.out.println("Дополнительное задание");

        char name1 = '\u0020';
        char name2 = '\u00ab';
        char name3 = '\u0417';
        char name4 = '\u0434';
        char name5 = '\u0440';
        char name6 = '\u0430';
        char name7 = '\u0432';
        char name8 = '\u0441';
        char name9 = '\u0442';
        char name10 = '\u0432';
        char name11 = '\u0443';
        char name12 = '\u0439';
        char name13 = '\u0442';
        char name14 = '\u0435';
        char name15 = '\u002c';
        char name16 = '\u0020';
        char name17 = '\u041f';
        char name18 = '\u0430';
        char name19 = '\u0432';
        char name20 = '\u0435';
        char name21 = '\u043b';
        char name22 = '\u0020';
        char name23 = '\u0413';
        char name24 = '\u0430';
        char name25 = '\u0440';
        char name26 = '\u043c';
        char name27 = '\u0430';
        char name28 = '\u0442';
        char name29 = '\u044e';
        char name30 = '\u043a';
        char name31 = '\u0020';
        char name32 = '\u0021';
        char name33 = '\u00bb';

        System.out.print("\u0020\u00ab\u0417\u0434\u0440\u0430\u0432\u0441\u0442\u0432\u0443\u0439\u0442" +
                "\u0435\u002c\u0020\u041f\u0430\u0432\u0435\u043b\u0020\u0413\u0430\u0440\u043c\u0430\u0442\u044e\u043a
                \u0020\u0021\u00bb");
                */ //Закомментил его, переписывать нет смысла посимвольно согласно CCJ,
        //т.к. это будет уже другое задание.
    }
}
