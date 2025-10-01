package dev.kuchishkin.Collections.lesson2;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose realization: 1 - ArrayList, 2 - LinkedList");
        int choice = scanner.nextInt();
        scanner.nextLine();

        List<String> tasks;

        if (choice == 1) {
            tasks = new ArrayList<>();
            System.out.println("Using ArrayList.");
        } else {
            tasks = new LinkedList<>();
            System.out.println("Using LinkedList.");
        }
        System.out.println();

        while (true) {
            System.out.println("Choose action:");
            System.out.println("1. Add task");
            System.out.println("2. Insert task to position");
            System.out.println("3. Delete task by index");
            System.out.println("4. Delete task by value");
            System.out.println("5. Show all tasks");
            System.out.println("0. Exit");

            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 1:
                    System.out.print("Enter task: ");
                    String taskToAdd = scanner.nextLine();
                    tasks.add(taskToAdd);
                    System.out.println("Task added.");
                    System.out.println();
                    break;

                case 2:
                    System.out.print("Enter task: ");
                    String taskToInsert = scanner.nextLine();
                    System.out.print("Enter position: ");
                    int index = scanner.nextInt();
                    scanner.nextLine();
                    if (index > 0 && index <= tasks.size() + 1) {
                        tasks.add(index - 1, taskToInsert);
                        System.out.println("Task added.");
                    } else {
                        System.out.println("Invalid position.");
                    }
                    System.out.println();
                    break;

                case 3:
                    System.out.print("Enter task index: ");
                    int indexToRemove = scanner.nextInt();
                    scanner.nextLine();
                    if (indexToRemove > 0 && indexToRemove <= tasks.size()) {
                        String removed = tasks.remove(indexToRemove - 1);
                        System.out.println("Task deleted: " + removed);
                    } else {
                        System.out.println("Invalid index.");
                    }
                    System.out.println();
                    break;

                case 4:
                    System.out.print("Enter task value: ");
                    String taskToRemove = scanner.nextLine();
                    if (tasks.remove(taskToRemove)) {
                        System.out.println("Task deleted.");
                    } else {
                        System.out.println("Invalid value.");
                    }
                    System.out.println();
                    break;

                case 5:
                    System.out.println("Tasks list:");
                    for (int i = 0; i < tasks.size(); i++) {
                        System.out.println((i + 1) + ". " + tasks.get(i));
                    }
                    System.out.println();
                    break;

                case 0:
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid input.");
            }
        }
    }
}
