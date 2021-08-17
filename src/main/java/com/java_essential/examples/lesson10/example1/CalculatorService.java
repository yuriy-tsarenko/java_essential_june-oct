package com.java_essential.examples.lesson10.example1;

public interface CalculatorService {

    int getResult(String line) throws UnsupportedOperationException, CalculatorException;
}
