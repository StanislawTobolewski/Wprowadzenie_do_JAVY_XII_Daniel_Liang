package chapter_II;

import java.util.Scanner;

public class Exercise_2_7A {
    public static void main(String[] args) {
        long timeInMinutes = 0;

        Scanner inScanner = new Scanner(System.in);
        System.out.printf("Please enter time in minutes: ");
        timeInMinutes = inScanner.nextLong();

        long years = timeInMinutes/365/24/60;
        long remainingMinutes = timeInMinutes - (years*365*24*60);
        long days = remainingMinutes/60/24;


        System.out.printf("%d minutes is about %d years and %d days",timeInMinutes, years, days);

    }

}
