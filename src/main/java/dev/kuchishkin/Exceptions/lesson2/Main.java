package dev.kuchishkin.Exceptions.lesson2;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) {
        try{
            readFirstLineFromFile("test.txt");
        } catch (IOException e) {
            System.out.println("Error reading file");
        }

        try{
            tryIndexOutOfBounds();
        }catch(IndexOutOfBoundsException e){
            System.out.println("Index out of bounds");
        }
    }

    public static String readFirstLineFromFile(String fileName) throws IOException {
        File file = new File(fileName);

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            return reader.readLine();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        return "";
    }

    public static void tryIndexOutOfBounds(){
        int[] arr = new int[5];
        arr[7] = 4;
    }
}
