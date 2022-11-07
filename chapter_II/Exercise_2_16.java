package chapter_II;

import java.util.Scanner;

public class Exercise_2_16 {
    public static void main(String[] args) {

        double side = 0.0;
        double area = 0.0;

        Scanner inScanner = new Scanner(System.in);
        System.out.printf("Specify hexagon side lenght:");
        side = inScanner.nextDouble();

        double nominator;
        double denominator;

        nominator = 3.0*(Math.pow(3.0,0.5));
        denominator = 2.0;

        area = (nominator/denominator)*(side*side);

        System.out.printf("Hexagon surface: %.2f", area);

    }
}
