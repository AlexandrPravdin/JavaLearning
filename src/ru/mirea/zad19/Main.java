package ru.mirea.zad19;

import java.util.Scanner;

import java.util.Scanner;

public class Main {
//2 number
    public static void main(String[] args) throws IncorrectINNException {
        INN[] inns = new INN[]{new INN("Nik", "000000"), new INN("John", "111111"), new INN("Kate", "222222")};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name and inn: ");
        String userName = scanner.next();
        String userINN = scanner.next();
        INN[] var5 = inns;
        int var6 = inns.length;

        for (int var7 = 0; var7 < var6; ++var7) {
            INN inn = var5[var7];
            if (inn.name.equals(userName)) {
                if (!inn.inn.equals(userINN)) {
                    throw new IncorrectINNException("INN " + userINN + " is not user`s " + userINN + " inn");
                }

                System.out.println("Success");
                break;
            }
        }

    }
}
