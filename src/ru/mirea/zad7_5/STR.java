package ru.mirea.zad7_5;

public class STR implements StringWork {
    @Override
    public int CountChar(String string) {
        return string.length();
    }

    @Override
    public String OddChar(String string) {
        String OddString = "";
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            if (i % 2 == 1) {
                count++;
            }
        }
        char[] newString = string.toCharArray();
        char[] newOdd = new char[count];
        for (int i = 0; i < string.length(); i++) {
            if (i % 2 == 1) {
                newOdd[i / 2] = newString[i];
            }
        }

        return String.valueOf(newOdd);
    }

    @Override
    public String ReverseString(String string) {
        char[] newString = string.toCharArray();
        char[] newOdd = new char[string.length()];
        for (int i = 0; i < string.length(); i++) {
            newOdd[string.length() - 1 - i] = newString[i];
        }

        return String.valueOf(newOdd);
    }


}
