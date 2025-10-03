package dev.kuchishkin.ReflectionAPI.lesson3;


import java.lang.reflect.Method;


public class Main {
    public static void main(String[] args) {
        Class<?> clazz = Book.class;
        Method[] methods = clazz.getMethods();
        for (Method method : methods) {
            if (method.isAnnotationPresent(Author.class)) {
                Author author = method.getAnnotation(Author.class);
                System.out.println(author.name());
            }
        }

    }
}
