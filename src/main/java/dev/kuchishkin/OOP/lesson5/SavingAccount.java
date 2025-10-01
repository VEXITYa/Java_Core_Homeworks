package dev.kuchishkin.OOP.lesson5;


public class SavingAccount extends Account implements Printable {
    public SavingAccount() {
        super();
    }

    public SavingAccount(double balance) {
        super(balance);
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Not enough money");
        }
    }

    public void printInfo() {
        System.out.println("Saving account balance: " + balance);
    }
}
