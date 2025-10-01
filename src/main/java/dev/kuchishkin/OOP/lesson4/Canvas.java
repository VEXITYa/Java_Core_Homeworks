package dev.kuchishkin.OOP.lesson4;


import java.util.ArrayList;
import java.util.List;


public class Canvas {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<Shape>();
        shapes.add(new Circle());
        shapes.add(new Square());
        shapes.add(new Triangle());

        for (Shape shape : shapes) {
            shape.draw();
        }
    }
}
