package chapter_II;

import java.util.Scanner;

public class Exercise_2_21 {
    public static void main(String[] args) {

        double futureInvestmentIncome = 0.0;
        double investAmount = 0.0;
        double yearPercentage = 0.0;
        double monthlyPercentage = 0.0;
        int numberOfYears = 0;

        Scanner inScanner = new Scanner(System.in);
        System.out.println("Specify invest amount: ");
        investAmount = inScanner.nextDouble();
        System.out.println("Specify interest (per year): ");
        yearPercentage = inScanner.nextDouble();
        System.out.println("Specify investment period (years): ");
        numberOfYears = inScanner.nextInt();

        double x = 0.0;
        double y = 0.0;
        double z = 0.0;

        //future invest = invest amount * x     [ where x = (y)^z ]
        monthlyPercentage = (yearPercentage * 0.01)/12;
        y = 1.0 + monthlyPercentage;

        z = numberOfYears * 12.0;

        x = Math.pow(y,z);

        futureInvestmentIncome = investAmount * x;

        System.out.printf("Future investment value: %.2f $", futureInvestmentIncome);
    }
}