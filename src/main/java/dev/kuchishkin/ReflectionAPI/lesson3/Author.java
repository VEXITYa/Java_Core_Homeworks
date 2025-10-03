package dev.kuchishkin.ReflectionAPI.lesson3;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Author {
    String name();

    /**
     * Возвращает строковое представление даты создания в формате "yyyy-MM-dd".
     *
     * @return строка даты в формате "yyyy-MM-dd"
     */
    String date();
}
