package org.example;

import org.example.answer.CentimeterKilometer;
import org.example.answer.ConvertTemp;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ConvertTemp test1 = new ConvertTemp(320.4);


        System.out.println(test1.getCelcius());

        CentimeterKilometer test2 = new CentimeterKilometer(3403402);

        System.out.println(test2.getKilometer());

    }
}