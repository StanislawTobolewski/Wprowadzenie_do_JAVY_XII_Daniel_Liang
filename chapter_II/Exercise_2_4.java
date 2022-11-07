package chapter_II;

import java.util.Scanner;

public class Exercise_2_4 {
    public static void main(String[] args) {
        String inputText= "Enter weight in funts: ";
        String outputText = "Weight in kilograms: %.2f";

        double funtWeight = 0.0;
        Scanner inScanner = new Scanner(System.in);

        System.out.printf(inputText);
        funtWeight = inScanner.nextDouble();

        System.out.printf(outputText,calcKilograms(funtWeight));
    }
    public static double calcKilograms(double funts){
        return funts * 0.454;
    }
}
