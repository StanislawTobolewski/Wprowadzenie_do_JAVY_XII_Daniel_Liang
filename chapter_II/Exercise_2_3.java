package chapter_II;

import java.util.Scanner;

public class Exercise_2_3 {
    public static void main(String[] args) {
        double feets = 0.0;
        Scanner inputFeets = new Scanner(System.in);
        System.out.printf("Insert distance in feet: ");
        feets = inputFeets.nextDouble();

        System.out.printf("\n%.1f feet it's a %.2f meters.",feets, calcMeeters(feets));
    }

    public static double calcMeeters(double feets){
        return feets*0.305;
    }
}
