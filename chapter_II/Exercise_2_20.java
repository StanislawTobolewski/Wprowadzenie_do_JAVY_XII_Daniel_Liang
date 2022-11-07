package chapter_II;

import java.util.Scanner;

public class Exercise_2_20 {
    public static void main(String[] args) {

        double accountValue = 0.0;
        double percentagePerYear = 0.0;
        double interests = 0.0;

        Scanner inScanner = new Scanner(System.in);
        System.out.printf("Specify account balance and percentage (per year) :");

        accountValue = inScanner.nextDouble();
        percentagePerYear = inScanner.nextDouble();

        interests = accountValue * (percentagePerYear/1200);

        System.out.printf("Next month interest: %.2f", interests );

    }
}
