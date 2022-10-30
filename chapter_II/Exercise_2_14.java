package chapter_II;

import java.util.Scanner;

public class Exercise_2_14 {
    public static void main(String[] args) {

        //BMI = weight[kg] / height [m] ^ 2;
        double weightInKg = 0.0;
        double heightInMeters = 0.0;
        double BMI = 0.0;

        Scanner inScanner = new Scanner(System.in);
        System.out.println("Your weight in funts: ");
        weightInKg = inScanner.nextDouble()*0.45359237;
        System.out.println("Your wheight in cals: ");
        heightInMeters = inScanner.nextDouble() * 0.0254;

        BMI = weightInKg / Math.pow(heightInMeters,2);

        System.out.printf("Your BMI equals: %.4f", BMI);

    }
}
