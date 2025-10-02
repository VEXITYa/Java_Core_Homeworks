package dev.kuchishkin.ReflectionAPI.lesson1;


public class Person {
    public String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String sayHello() {
        return "Hello";
    }
}
