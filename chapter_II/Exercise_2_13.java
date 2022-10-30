package chapter_II;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercise_2_13 {

    private static double monthlySavings = 0.0;
    private static double monthlyPercentage = (0.05/12);
    private static int savingTime = 6;

    public static void main(String[] args) {

        Scanner inScanner = new Scanner(System.in);
        System.out.printf("Please specify monthly saving: ");
        monthlySavings = inScanner.nextDouble();

        System.out.printf("After 6 months saving u will have: %.2f $ on your account.", calculateIncome(monthlySavings, monthlyPercentage));
    }
    public static double calculateIncome(double monthlySavings, double percentage){
        double accountBalance = 0.0;

        for(int i = 0 ; i < savingTime ; i++){
            accountBalance = accountBalance + monthlySavings;
            accountBalance = accountBalance + (accountBalance * percentage);
        }
        return accountBalance;
    }
}