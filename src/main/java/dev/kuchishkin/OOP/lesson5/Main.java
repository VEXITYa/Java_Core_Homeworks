package dev.kuchishkin.OOP.lesson5;


public class Main {
    public static void main(String[] args) {
        SavingAccount savingAccount = new SavingAccount(150);
        CreditAccount creditAccount = new CreditAccount(100, 200);

        ((Printable) savingAccount).printInfo();
        ((Printable) creditAccount).printInfo();
        System.out.println();

        System.out.println("Deposit 50...");
        savingAccount.deposit(50);
        creditAccount.deposit(50);
        ((Printable) savingAccount).printInfo();
        ((Printable) creditAccount).printInfo();
        System.out.println();

        System.out.println("Withdraw 50...");
        savingAccount.withdraw(50);
        creditAccount.withdraw(50);
        ((Printable) savingAccount).printInfo();
        ((Printable) creditAccount).printInfo();
        System.out.println();

        System.out.println("Withdraw 200...");
        savingAccount.withdraw(200);
        creditAccount.withdraw(200);
        ((Printable) savingAccount).printInfo();
        ((Printable) creditAccount).printInfo();
    }
}
