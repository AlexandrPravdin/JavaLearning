package ru.mirea.pract7;

import java.util.Scanner;

public class Game {
    private Player p1 = new Player();
    private Player p2 = new Player();

    void Game() {
        int count = 0;
        p1.Player();
        p2.Player();
        while (p1.GetSize() != 0 && p2.GetSize() != 0) {
            if (count == 106){
                System.out.println("Botva");
                return;
            }
            count++;
            int p1Top = p1.GetTop();
            int p2top = p2.GetTop();
            //System.out.println("player 1 is " + p1Top + " player 2 is " + p2top);
            if (p1Top > p2top || (p1Top == 0 && p2top == 9)) {
                p1.Win(p2top);
                p2.Lose();
            } else if (p1Top < p2top || (p1Top == 9 && p2top == 0)) {
                p2.Win(p1Top);
                p1.Lose();
            } else { //ничья
                p1.Win();
                p2.Win();
            }
        }
        if (p1.GetSize() == 0) {
            System.out.println("player 1 ");
        } else System.out.println("player 2 ");
        System.out.println(count);
        return;
    }
}
