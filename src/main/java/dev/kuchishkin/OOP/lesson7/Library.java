package dev.kuchishkin.OOP.lesson7;


public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("Java Basics", "Author A");
        Book book2 = new Book("Python Basics", "Author B");
        Book book3 = new Book("Java Basics", "Author C");
        Book book4 = new Book("Java Basics", "Author A");

        System.out.println("Book 1: " + book1);
        System.out.println("Book 2: " + book2);
        System.out.println("Book 3: " + book3);
        System.out.println("Book 4: " + book4);
        System.out.println();

        System.out.println("Book 1 equals Book 2: " + book1.equals(book2));
        System.out.println("Book 1 equals Book 3: " + book1.equals(book3));
        System.out.println("Book 1 equals Book 4: " + book1.equals(book4));
        System.out.println();

        System.out.println("Book 1 hashcode equals Book 2 hashcode: " + (book1.hashCode() == book2.hashCode()));
        System.out.println("Book 1 hashcode equals Book 3 hashcode: " + (book1.hashCode() == book3.hashCode()));
        System.out.println("Book 1 hashcode equals Book 4 hashcode: " + (book1.hashCode() == book4.hashCode()));
        System.out.println();
    }
}
