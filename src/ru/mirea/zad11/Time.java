package ru.mirea.zad11;


import java.util.*;

public class Time {
    static Scanner sc;

    public Time() {
    }

    public static void exOne() {
        Date date = new Date();
        System.out.printf(" task: start - 9, 21:25,end - %1$s, %2$s:%3$s", date.getDate(), date.getHours(), date.getMinutes());
    }

    public static void exTwo() {
        System.out.print("Enter time: ");
        long userTime = sc.nextLong();
        Date userDate = new Date(userTime);
        String result = userDate.before(new Date()) ? "before" : "after";
        System.out.printf("Entered time is %1$s system time", result);
    }

    public static void exFour() {
        System.out.println("Enter date (year,date,month,hours,minutes): ");
        int year = sc.nextInt();
        int month = sc.nextInt();
        int date = sc.nextInt();
        int hours = sc.nextInt();
        int minutes = sc.nextInt();
        Date userDate = new Date(year, month, date, hours, minutes);
        System.out.println(userDate);
    }

    public static void exFive() {
        ArrayList<Integer> arrayList = new ArrayList();
        LinkedList<Integer> linkedList = new LinkedList();
        long start = System.nanoTime();
        arrayList.add(5);
        long end = System.nanoTime();
        System.out.printf("Time for inserting in arrayList: %1$s ns\n", end - start);
        start = System.nanoTime();
        linkedList.add(5);
        end = System.nanoTime();
        System.out.printf("Time for inserting in linkedList: %1$s ns\n", end - start);
        start = System.nanoTime();
        arrayList.remove(0);
        end = System.nanoTime();
        System.out.printf("Time for deleting in arrayList: %1$s ns\n", end - start);
        start = System.nanoTime();
        linkedList.remove(0);
        end = System.nanoTime();
        System.out.printf("Time for removing in linkedList: %1$s ns\n", end - start);
        int[] r = new int[]{1,2,4,5,6,7,8,9,10,11};
        start = System.nanoTime();
        r[5] = 5;
        end = System.nanoTime();
        System.out.printf("Time for vstaving in linkedList: %1$s ns\n", end - start);

        Arrays.asList(r).contains(5);

        //поиск вставка
    }

    static {
        sc = new Scanner(System.in);
    }
}
