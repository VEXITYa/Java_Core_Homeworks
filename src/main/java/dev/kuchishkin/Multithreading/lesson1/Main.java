package dev.kuchishkin.Multithreading.lesson1;


public class Main {
    static Integer count = 0;

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 100; i++) count++;
        });

        Runnable runnable2 = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) count++;
            }
        };
        Thread thread2 = new Thread(runnable2);

        Runnable runnable3 = () -> {
            for (int i = 0; i < 100; i++) count++;
        };
        Thread thread3 = new Thread(runnable3);

        Thread thread4 = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) count++;
            }
        };

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        thread1.join();
        thread2.join();
        thread3.join();
        thread4.join();

        System.out.println(count);
    }
}
