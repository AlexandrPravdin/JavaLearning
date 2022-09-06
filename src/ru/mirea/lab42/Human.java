package ru.mirea.lab42;

public class Human implements Head, Hand, Leg{

    public void DoFighting(){
        DoMove();
        DoThink();
        DoFight();
        System.out.println("Fight is win");
    }

    public void DoEating(){
        DoSit();
        DoBendOver();
        DoEat();
    }


}

