package org.example;




import org.example.answer.CentimeterKilometer;

import org.example.answer.ConvertTemp;


import org.example.answer.*;


// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ConvertTemp test1 = new ConvertTemp(320.4);



            // Press Ctrl+D to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Cmd+F8.
            System.out.println("i = " + i);
        }

        CentimeterKilometer test2 = new CentimeterKilometer(3403402);

        System.out.println(test2.getKilometer());

        System.out.println("The celcius is :"+test1.getCelcius());

        CentimeterKilometer test2 = new CentimeterKilometer(3403402);

        System.out.println("The kilomter is " + test2.getKilometer());

        OddEven test3 = new OddEven(5);
        System.out.println("Is it odd number:" + test3.isOdd());

        SearchString test4= new SearchString("Ayam Kokok");

        System.out.println("What Is the string after we remove:" + test4.removeString("ko"));

        Palindrome test5= new Palindrome("madam");

        System.out.println("Is the word is palindrome : "+ test5.isPalindrome());


    }
}