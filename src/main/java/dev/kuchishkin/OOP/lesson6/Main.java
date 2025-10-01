package dev.kuchishkin.OOP.lesson6;


public class Main {
    public static void main(String[] args) {
        System.out.println("Total score:" + GameScore.totalScore);

        Player player1 = new Player("John", 10);
        System.out.println();
        System.out.println("Player added: " + player1);
        System.out.println("Total score:" + GameScore.totalScore);

        Player player2 = new Player("Bob", 6);
        System.out.println();
        System.out.println("Player added: " + player1);
        System.out.println("Total score:" + GameScore.totalScore);
    }
}
