package dev.kuchishkin.OOP.lesson5;


public abstract class Account {
    protected double balance;

    public Account() {
        balance = .0;
    }

    public Account(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public abstract void withdraw(double amount);
}
