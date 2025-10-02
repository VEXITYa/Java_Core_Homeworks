package dev.kuchishkin.ReflectionAPI.lesson1;


import java.lang.reflect.Modifier;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        Person person = new Person("John", 24);

        Class<?> clazz = person.getClass();
        System.out.println(clazz.getName());
        System.out.println(clazz.getSimpleName());
        System.out.println(Arrays.toString(clazz.getInterfaces()));

        System.out.println(Modifier.toString(clazz.getModifiers()));
    }
}
