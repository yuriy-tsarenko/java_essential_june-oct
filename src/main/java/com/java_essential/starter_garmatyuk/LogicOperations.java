package com.java_essential.starter_garmatyuk;

public class LogicOperations {
    /** Задание 3 005_Logic
     Используя IntelliJ IDEA, создайте класс LogicOperations.
     Имеется 3 переменные типа int x = 5, y = 10, и z = 15;
     Выполните и рассчитайте результат следующих операций для этих переменных:
      x += y >> x++ * z;
      z = ++x & y * 5;
      y /= x + 5 | z;
      z = x++ & y * 5;
      x = y << x++ ^ z;*/
    public static void main(String[] args) {
        int x = 5, y = 10, z = 15;
        // x = 10 / 2^75 ;;; >> div  5* 15 == 75 ;;; x ==>:  5 += 10 / 2^75 ==>: 5+= 0
        //x = 5 + 0
        x += y >> x++ * z;
        System.out.println(x);
        z = ++x & y * 5;
        //z == ++5==> 6 И 50  ===>> в бин  6== 0000 0110;; 50 == 0011 0010 >>&>>0000 0010 == 2
        System.out.println(z);
        y /= x + 5 | z;
        //1011 == 11
        //0010 == 2
        //1011 == 2^0 + 2^1 + 0^2 + 2^3 == 1 + 2 + 0 + 8 == 11
        //10 div 11 == 0
        System.out.println(y);
        z = x++ & y * 5;
        System.out.println(z);
        x = y << x++ ^ z;
        System.out.println(x);
    }
}
