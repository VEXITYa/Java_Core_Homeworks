package dev.kuchishkin.StreamAPI.lesson1;


import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        MyCalculator calc1 = new MyCalculator() {
            @Override
            public double calculate(int a, int b) {
                return a + b;
            }
        };
        MyCalculator calc2 = (num1, num2) -> num1 + num2;

        testCalculator(calc1);
        testCalculator(calc2);
    }

    public static void testCalculator(MyCalculator calc) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number:");
        int num1 = input.nextInt();
        input.nextLine();
        System.out.print("Enter second number:");
        int num2 = input.nextInt();
        input.nextLine();

        System.out.println(calc.calculate(num1, num2));
    }
}
