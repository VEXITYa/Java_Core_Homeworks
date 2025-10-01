package dev.kuchishkin.StreamAPI.lesson2;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;


public class Main {
    public static void main(String[] args) {
        int[] numbers = {0, 1, 2, 3, 4 ,5, 6, 7, 8, 9};
        List<Integer> list = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);

        Arrays.stream(numbers).filter(n -> n % 2 == 0).limit(3).forEach(System.out::println);
        System.out.println();
        list.stream().map(n -> n * n).forEach(System.out::println);
        System.out.println();
        Stream.generate(Math::random).filter(n -> n > .5).limit(5).forEach(System.out::println);
        System.out.println();
        Stream.of(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)
                .filter(n -> n % 2 != 0)
                .map(n -> n * 2)
                .forEach(System.out::println);
    }
}
