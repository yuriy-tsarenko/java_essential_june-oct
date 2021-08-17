package com.java_essential.examples.lesson10.example1;

import java.util.regex.Pattern;

public class CalculatorServiceImpl implements CalculatorService {

    @Override
    public int getResult(String line) throws UnsupportedOperationException, ArithmeticException, CalculatorException {
        String operator = getOperator(line);
        Variables variables = getVariables(line, operator);
        switch (operator) {
            case "+":
                return plus(variables);
            case "-":
                return minus(variables);
            case "/":
                return divide(variables);
            case "*":
                return multiply(variables);
            default:
                throw new CalculatorException("can't select necessary method");
        }
    }


    private int plus(Variables variables) {
        return variables.getVariableOne() + variables.getVariableTwo();
    }


    private int minus(Variables variables) {
        return variables.getVariableOne() - variables.getVariableTwo();
    }


    private int divide(Variables variables) throws ArithmeticException {
        return variables.getVariableOne() / variables.getVariableTwo();
    }


    private int multiply(Variables variables) {
        return variables.getVariableOne() * variables.getVariableTwo();
    }

    private String getOperator(String line) {
        Pattern patternPlus = Pattern.compile("[0-9]+[+][0-9]+");
        Pattern patternMinus = Pattern.compile("[0-9]+[-][0-9]+");
        Pattern patternDivide = Pattern.compile("[0-9]+[/][0-9]+");
        Pattern patternMultiply = Pattern.compile("[0-9]+[*][0-9]+");

        boolean matchesPlus = patternPlus.matcher(line).matches();
        boolean matchesMinus = patternMinus.matcher(line).matches();
        boolean matchesDivide = patternDivide.matcher(line).matches();
        boolean matchesMultiply = patternMultiply.matcher(line).matches();

        if (matchesPlus) {
            return "+";
        } else if (matchesMinus) {
            return "-";
        } else if (matchesDivide) {
            return "/";
        } else if (matchesMultiply) {
            return "*";
        }
        throw new UnsupportedOperationException("unsupported operator");
    }

    private Variables getVariables(String line, String operator) {
        Variables variables = new Variables();
        String[] values = line.split("[" + operator + "]");
        variables.setVariableOne(Integer.parseInt(values[0]));
        variables.setVariableTwo(Integer.parseInt(values[1]));
        return variables;
    }
}
