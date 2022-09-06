package ru.mirea.lab42;

public class Human extends Hand, Head, Leg {

    public void DoFighting(){
        DoMove();
        DoThink();
        DoFight();
    }
}

