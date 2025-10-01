package dev.kuchishkin.Collections.lesson1;


public class Main {
    public static void main(String[] args) {
        GenericBox<String> stringBox = new GenericBox<>("Hello");
        GenericBox<Integer> intBox = new GenericBox<>(42);
        GenericBox<Double> doubleBox = new GenericBox<>(3.14);

        System.out.println("Initial values:");
        System.out.println("stringBox: " + stringBox.getValue());
        System.out.println("intBox: " + intBox.getValue());
        System.out.println("doubleBox: " + doubleBox.getValue());
        System.out.println();

        stringBox.setValue("World");
        System.out.println("stringBox after setValue: " + stringBox.getValue());
        System.out.println();

        GenericBox<String> anotherStringBox = new GenericBox<>("World");
        System.out.println("stringBox == anotherStringBox: " + stringBox.isEqual(anotherStringBox));
        System.out.println();

        GenericBox<String> box1 = new GenericBox<>("Apple");
        GenericBox<String> box2 = new GenericBox<>("Banana");

        System.out.println("Before swap:");
        System.out.println("box1: " + box1.getValue());
        System.out.println("box2: " + box2.getValue());

        box1.swap(box2);

        System.out.println("After swap:");
        System.out.println("box1: " + box1.getValue());
        System.out.println("box2: " + box2.getValue());
    }
}
