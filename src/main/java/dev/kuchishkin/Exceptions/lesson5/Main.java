package dev.kuchishkin.Exceptions.lesson5;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter filepath: ");
        String filePath = input.nextLine().trim();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String[] line = br.readLine().split("\\s+");
            System.out.println(String.format("The first line contains %d words", line.length));
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (InputMismatchException e) {
            System.out.println("Invalid input");
        } catch (IOException e) {
            System.out.println("Something went wrong");
        } finally {
            System.out.println("Thank you for using this program");
        }

    }
}
