package com.java_essential.examples.lesson10.example1;

import org.apache.log4j.Logger;

import java.util.Scanner;

public class CalculatorEngine {

    private static final Logger log = Logger.getLogger(CalculatorEngine.class);

    private final CalculatorService calculatorService = new CalculatorServiceImpl();

    public void execute(String[] args) {
        boolean repeat = true;
        while (repeat) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("enter a data according to the following format");
            System.out.println("dd[+-/*]dd");
            System.out.println("Example: 25+34");

            String line = scanner.nextLine();

            try {
                int result = calculatorService.getResult(line);
                System.out.printf("result is: %d\n", result);
                repeat = confirmRepeat();
            } catch (UnsupportedOperationException | CalculatorException | ArithmeticException e) {
                log.error(e);
                System.err.println(e);
                repeat = confirmRepeat();
            }
        }
    }


    public boolean confirmRepeat() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("type 'Y' to repeat or any other button to exit");
        String userChoice = scanner.next();
        return userChoice.equalsIgnoreCase("Y");
    }
}
