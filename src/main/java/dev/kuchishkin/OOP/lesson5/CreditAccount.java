package dev.kuchishkin.OOP.lesson5;


public class CreditAccount extends Account implements Printable {
    private final double creditLimit;

    public CreditAccount() {
        super();
        this.creditLimit = 0;
    }

    public CreditAccount(double balance, double creditLimit) {
        super(balance);
        this.creditLimit = creditLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (balance - amount >= -creditLimit) {
            balance -= amount;
        } else {
            System.out.println("Not enough money");
        }
    }


    @Override
    public void printInfo() {
        System.out.println("Credit Account balance: " + balance + ". Credit limit: " + creditLimit);
    }
}
