package ru.mirea.zad6_10;

import java.util.Scanner;

public class Shop implements EnterPc {
    private Computer computer;
    Scanner scanner = new Scanner(System.in);

    @Override
    public void EnterP() {
        String namePC = scanner.nextLine();
        String nameMem = scanner.nextLine();
        String nameMonit = scanner.nextLine();
        String nameProc = scanner.nextLine();
        computer = new Computer(namePC, nameMem, nameMonit, nameProc);
    }

    public Computer getComputer() {
        return computer;
    }
}
