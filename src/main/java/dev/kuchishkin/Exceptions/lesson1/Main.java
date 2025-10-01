package dev.kuchishkin.Exceptions.lesson1;


import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int firstNumber = input.nextInt();
        System.out.println("Enter second number: ");
        int secondNumber = input.nextInt();
        try{
            System.out.println("Result: " + (firstNumber / secondNumber));
        }catch(ArithmeticException ex){
            System.out.println("Division by zero. Please try again.");
        }
        finally {
            System.out.println("Thank you for using this program.");
        }
    }
}
