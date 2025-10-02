package dev.kuchishkin.ReflectionAPI.lesson2;


import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


public class Main {
    public static void main(String[] args){
        Class<?> clazz = Student.class;

        try{
            Constructor<?> constructor = clazz.getDeclaredConstructor(String.class, int.class, String.class);
            constructor.setAccessible(true);
            Student student = (Student) constructor.newInstance("John", 18, "SSU");
            Field[] fields = clazz.getDeclaredFields();
            for (Field field : fields) {
                System.out.print(field.getName() + ": ");
                field.setAccessible(true);
                System.out.println(field.get(student));
            }

            Field field = clazz.getDeclaredField("name");
            field.setAccessible(true);
            field.set(student, "Jane");
            System.out.print(field.getName() + ": ");
            System.out.println(field.get(student));

            Method method = clazz.getDeclaredMethod("studySecretly");
            method.setAccessible(true);
            method.invoke(student);
        } catch (NoSuchFieldException | InvocationTargetException | NoSuchMethodException | InstantiationException |
                 IllegalAccessException e) {
            System.out.println(e.getMessage());
        }

    }
}
