package com.java_essential.kvirikadze.homework.lesson3.issue3;

import java.util.Scanner;

public class License {
    private static final String PRO_LICENSE = "PRO";
    private static final String EXPERT_LICENSE = "EXPERT";

    public static boolean checkLicenseIsPro(String license) {
        return license.equals(PRO_LICENSE);
    }

    public static boolean checkLicenseIsExpert(String license) {
        return license.equals(EXPERT_LICENSE);
    }

    public static String getLicenseFromUser() {
        System.out.print("Введите Вашу лицензию: ");
        return new Scanner(System.in).nextLine();
    }

}
