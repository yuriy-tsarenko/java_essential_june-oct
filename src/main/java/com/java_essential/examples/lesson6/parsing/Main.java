package com.java_essential.examples.lesson6.parsing;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String value = scanner.next();
        System.out.println(convert(value));
    }

    public static Value parser(String value) {
        Pattern patternInteger = Pattern.compile("[0-9]");
        Pattern patternString = Pattern.compile("[a-z]");
        String[] stringsInteger = patternString.split(value);
        String[] stringsValue = patternInteger.split(value);
        int parseInt = Integer.parseInt(stringsInteger[0]);
        String string = stringsValue[stringsValue.length - 1];
        Value valueObject = new Value();
        valueObject.setDistance(parseInt);
        valueObject.setKey(string);
        return valueObject;
    }

    public static String convert(String value) {
        Value valueObject = parser(value);
        int distance = valueObject.getDistance();
        double result = 0;
        switch (valueObject.getKey()) {
            case "m":
                result = (double) distance / 1000;
                return result + " km";
            case "sm":
                result = (double) distance / 10000;
                return result + " km";
            default:
                System.err.println("error");
                System.exit(-1);
        }
        return null;
    }
}
