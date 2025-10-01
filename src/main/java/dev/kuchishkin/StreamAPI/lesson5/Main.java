package dev.kuchishkin.StreamAPI.lesson5;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = IntStream.rangeClosed(1, 20)
                .boxed()
                .collect(Collectors.toList());

        var stream = numbers.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * n);

        List<Integer> squaredEvens = stream.collect(Collectors.toList());

        System.out.println("Результат:");
        squaredEvens.forEach(System.out::println);
        System.out.println();

        System.out.println("Попытка использовать тот же стрим снова:");
        try {
            stream.forEach(System.out::println);
        } catch (IllegalStateException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
        System.out.println();

        long startStream = System.nanoTime();
        List<Integer> resultStream = numbers.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .collect(Collectors.toList());
        long endStream = System.nanoTime();
        System.out.println("Время выполнения стрима: " + (endStream - startStream) + " нс");

        long startLoop = System.nanoTime();
        List<Integer> resultLoop = new java.util.ArrayList<>();
        for (Integer n : numbers) {
            if (n % 2 == 0) {
                resultLoop.add(n * n);
            }
        }
        long endLoop = System.nanoTime();
        System.out.println("Время выполнения цикла: " + (endLoop - startLoop) + " нс");
    }
}
