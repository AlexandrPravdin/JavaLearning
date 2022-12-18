package ru.mirea.zad13;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void firstNum(String string) {
        string = "I love Java!!!";
        System.out.printf("Last char in string '%1$s' is %2$s\n", string, string.charAt(string.length() - 1));
        System.out.printf("String '%1$s' ends with '!!!' - %2$s\n", string, string.endsWith("!!!"));
        System.out.printf("String '%1$s' starts with 'I like' - %2$s\n", string, string.startsWith("I like"));
        System.out.printf("String '%1$s' contains string 'I like' - %2$s\n", string, string.contains("Java"));
        System.out.printf("Index string 'Java' in string 'I like Java!!!' - %1$s\n", "I like Java".indexOf("Java"));
        System.out.printf("String before turning all 'a' to 'o' - '%1$s',after - '%2$s'\n", string, string.replaceAll("a", "o"));
        System.out.printf("String '%1$s' in upper case - '%2$s'\n", string, string.toUpperCase());
        System.out.printf("String '%1$s' in lower case - '%2$s'\n", string, string.toLowerCase());
        System.out.printf("String before cutout 'Java' - '%1$s', after - '%2$s'\n", string, string.substring(string.indexOf("Java"), string.indexOf("Java") + 4));
    }


    public static void secondNum() {
        long startTime, endTime;
        Person person1 = new Person("Ivanov", "Ivan", "Ivanovich");
        startTime = System.nanoTime();
        CharSequence string = person1.getFullNameStr();
        endTime = System.nanoTime();
        System.out.printf("Time for return String '%1$s' - %2$s ns\n", string, endTime - startTime);
        startTime = System.nanoTime();
        string = person1.getFullNameStrBuffer();
        endTime = System.nanoTime();
        System.out.printf("Time for return StringBuffer '%1$s' - %2$s ns\n", string, endTime - startTime);
        startTime = System.nanoTime();
        string = person1.getFullNameStrBuilder();
        endTime = System.nanoTime();
        System.out.printf("Time for return StringBuilder '%1$s' - %2$s ns\n", string, endTime - startTime);
        //посмотреть время
    }


    public static void thirdNum() {
        System.out.print("Enter address with separator ',': ");
        String addressStr = scanner.nextLine();
        Address address1 = new Address();
        address1.setAddressSplit(addressStr);
        System.out.println(address1);
        System.out.print("Enter address with whatever separator and separator: ");
        addressStr = scanner.nextLine();
        String sep = scanner.next();
        Address address2 = new Address();
        address2.setAddressTokenizer(addressStr, sep);
        System.out.println(address2);
    }

    public static void fourthNum() {
        String[] shirts = new String[11];
        shirts[0] = "S001,Black Polo Shirt,Black,XL";
        shirts[1] = "S002,Black Polo Shirt,Black,L";
        shirts[2] = "S003,Blue Polo Shirt,Blue,XL";
        shirts[3] = "S004,Blue Polo Shirt,Blue,M";
        shirts[4] = "S005,Tan Polo Shirt,Tan,XL";
        shirts[5] = "S006,Black TShirt,Black,XL";
        shirts[6] = "S007,White T-Shirt,White,XL";
        shirts[7] = "S008,White T-Shirt,White,L";
        shirts[8] = "S009,Green T-Shirt,Green,S";
        shirts[9] = "S010,Orange T-Shirt,Orange,S";
        shirts[10] = "S011,Maroon Polo Shirt,Maroon,S";
        Shirt[] shirtsArray = new Shirt[11];
        for (int i = 0; i < 11; i++) {
            Shirt shirt = new Shirt(shirts[i]);
            System.out.println(shirt);
            shirtsArray[i] = shirt;
        }
    }

    public static void fifthNum() {
        System.out.print("Enter telephone number: ");
        String telephone = scanner.next();
        Phone telephoneNumber = new Phone(telephone);
        System.out.println(telephoneNumber.getTelephoneNumber());
    }

    public static void main(String[] args) {
        System.out.print("Enter string: ");
        firstNum(scanner.nextLine());
        secondNum();
        thirdNum();
        fourthNum();
        fifthNum();
    }
}

//Russia,StPetersburg,StPetersburg,Dumskaya,12,11,228
//Russia;Moscow;Moscow;Pushkina;31;1;113
