package chapter_II;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner scanner1 = new Scanner (System.in);
//dane
        double monthlyInterestRate = 0.05 / 12;
        System.out.println("Welcome to our Monthly Interest Rate Calculator!");
        System.out.println("Please, type your savings amount from one month.");
        double usersAnswer = scanner1.nextDouble();  // 100

        double amount = usersAnswer * (1 + monthlyInterestRate);     //  = 100 * (1 + 0.00417)

        for(int i = 1; i <= 5; i++){
            double amount2 = (usersAnswer + amount) * (1 + monthlyInterestRate);     // = 100 + 100.417 -> 200.417
            amount2 = (int) (amount2 * 100) / 1000;                                  // (200.417 * 100) / 1000 -> 20.0417
            amount = amount2;
        }
        System.out.println(amount);
    }
}
