package dev.kuchishkin.ReflectionAPI.lesson2;


public class Student {
    private String name;
    private int age;
    public String university;

    private Student() {
    }

    public Student(String name, int age, String university) {
        this.name = name;
        this.age = age;
        this.university = university;
    }

    public void introduce() {
        System.out.println("Introducing...");
    }

    private void studySecretly() {
        System.out.println("Study Secretly...");
    }
}
