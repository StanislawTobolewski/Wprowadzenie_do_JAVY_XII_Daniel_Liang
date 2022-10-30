package chapter_II;

import java.util.Scanner;

public class Exercise_2_1 {
    public static void main(String[] args) {
        double celsius = 0.0;
        double farenheit = 0.0;
        Scanner userInput = new Scanner(System.in);
        System.out.printf("Podaj temperaturę w stopniach celciusza: ");
        celsius = userInput.nextDouble();
        System.out.printf("Stopnie celcjusza: %.1f, Stopnie Fahrenheita: %.1f.", celsius, calcFarenheit(celsius));

    }

    public static double calcFarenheit(double c){
        return ((9.0/5.0) * c) + 32;
    }

}
