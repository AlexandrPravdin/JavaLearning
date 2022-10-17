package ru.mirea.zad3_2;

import java.text.NumberFormat;
import java.util.Locale;

public class Converter {
    private double Rubles;

    public Converter(double rubles) {
        Rubles = rubles;
    }


    void ConverteToDollars() {
        NumberFormat numberFormat1 =
                NumberFormat.getCurrencyInstance(Locale.US);
        System.out.println(Rubles + "₽  = " + numberFormat1.format(Rubles / 65));
    }

    void ConverteToEuros() {
        NumberFormat numberFormat2 =
                NumberFormat.getCurrencyInstance(Locale.FRANCE);
        System.out.println(Rubles + "₽  = " + numberFormat2.format(Rubles / 73));
    }

    void ConverteToChina() {
        NumberFormat numberFormat3 =
                NumberFormat.getCurrencyInstance(Locale.CHINA);
        System.out.println(Rubles + "₽  = " + numberFormat3.format(Rubles / 8.67));
    }

}
