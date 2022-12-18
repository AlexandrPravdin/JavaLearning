package ru.mirea.pract7;

public class Main {
    public static void main(String[] args) {
        Player p1 = new Player();
        Player p2 = new Player();
        p1.FeelMeBro();
        p2.FeelMeBro();
        Game g = new Game(p1, p2);
        g.startGame();
    }
}
