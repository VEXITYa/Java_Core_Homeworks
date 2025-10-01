package dev.kuchishkin.StreamAPI.lesson3;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java is fun",
                                          "Stream API simplifies data processing",
                                          "Im trying my best in Java");
        list.stream()
                .flatMap(sentense -> Arrays.stream(sentense.split(" ")))
                .filter(word -> word.length() > 3)
                .distinct()
                .sorted()
                .forEach(System.out::println);
    }
}
