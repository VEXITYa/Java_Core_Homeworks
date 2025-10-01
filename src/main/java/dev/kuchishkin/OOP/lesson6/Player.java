package dev.kuchishkin.OOP.lesson6;


public class Player {
    String name;
    int points;

    public Player(String name, int points) {
        this.name = name;
        this.points = points;
        GameScore.addPoints(points);
    }

    @Override
    public String toString() {
        return "Player " + name + " has " + points + " points.";
    }
}
