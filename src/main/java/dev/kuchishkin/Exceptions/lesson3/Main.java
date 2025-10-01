package dev.kuchishkin.Exceptions.lesson3;


import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Logger logger = Logger.getLogger(Main.class.getName());
        List<String> operations = new ArrayList<>();
        boolean exit = false;
        int firstNumber = 0, secondNumber = 0;
        while (!exit) {
            try {
                System.out.print("Enter first number: ");
                firstNumber = Integer.parseInt(input.nextLine());
                System.out.print("Enter second number: ");
                secondNumber = Integer.parseInt(input.nextLine());
                System.out.println("Result: " + divide(firstNumber, secondNumber));
                logger.log(Level.INFO, String.format("firstNumber = %d; secondNumber = %d; Result = %f",
                                                     firstNumber, secondNumber, divide(firstNumber, secondNumber))
                          );
                operations.add(String.format("%d / %d = %f", firstNumber, secondNumber, divide(firstNumber, secondNumber)));
                System.out.println("Do you want to continue? y/n");
                String answer = input.next();
                if (!answer.equalsIgnoreCase("y")) {
                    exit = true;
                }
            } catch (InputMismatchException ex) {
                logger.severe("Invalid input");
                System.out.println("Invalid input");
            } catch (ArithmeticException ex) {
                operations.add(String.format("%d / %d : Error. Division by zero", firstNumber, secondNumber));
                logger.severe(ex.getMessage());
                System.out.println(ex.getMessage());
            }
        }
        System.out.println();
        System.out.println("History of operations:");
        for(int i  = 0; i < operations.size(); i++) {
            System.out.println((i + 1) + ". " + operations.get(i));
        }
    }

    public static double divide(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Divide by zero");
        }
        return a / b;
    }
}
