package com.java_essential.starter_garmatyuk;

public class SumMin {
    public static void main(String[] args) {
        //Дано два числа A и B (A<B) выведите суму всех чисел, расположенных между данными числами на экран.
        int A = 1;
        int B = 10;
        int sum = 0;
        for (int i = A + 1; i < B; i++) {
            sum += i;
        }
        System.out.println(sum);

        //Дано два числа A и B (A<B) выведите все нечетные значения, расположенные между данными числами.
            for (int i = A; i < B; i += 2){
                if ((A & 1) == 0) { // почему подсвечивает?
                    A++;
            }
                System.out.println(i);
        }
    }
}
