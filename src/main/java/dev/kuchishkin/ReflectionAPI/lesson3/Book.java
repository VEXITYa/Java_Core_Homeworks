package dev.kuchishkin.ReflectionAPI.lesson3;


public class Book {
    private String author;
    private String title;

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    @Author(name = "John", date = "2025-10-03")
    public String getAuthor() {
        return author;
    }

    @Author(name = "Bob", date = "2025-09-03")
    public String getTitle() {
        return title;
    }

    public String toString() {
        return "Book{" + "author=" + author + ", title=" + title + '}';
    }
}
