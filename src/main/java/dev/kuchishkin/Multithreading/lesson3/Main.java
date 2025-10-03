package dev.kuchishkin.Multithreading.lesson3;


public class Main {
    private static final int TRIES = 100;

    public static void main(String[] args) throws InterruptedException {
        Object resource1 = new Object();
        Object resource2 = new Object();

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < TRIES; i++) {
                synchronized (resource1) {
                    System.out.println("Первый поток захватил первый монитор");
                    synchronized (resource2) {
                        System.out.println("Первый поток захватил второй монитор");
                        System.out.println("---");
                    }
                }
            }
        });
        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < TRIES; i++) {
                synchronized (resource1) {
                    System.out.println("Второй поток захватил второй монитор");
                    synchronized (resource2) {
                        System.out.println("Второй поток захватил первый монитор");
                        System.out.println("---");
                    }
                }
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();
    }
}
