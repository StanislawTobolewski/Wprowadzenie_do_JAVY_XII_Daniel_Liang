package chapter_IV;

import java.util.Scanner;

public class Exercise_04_05 {
    public static void main(String[] args) {
        double sideWidth = 0.0;
        int sidesNumber = 0;
        double area = 0.0;
        Scanner inScanner = new Scanner(System.in);

        System.out.printf("Specify sides number: ");
        sidesNumber = inScanner.nextInt();
        System.out.printf("Specify sides width: ");
        sideWidth = inScanner.nextDouble();

        area = (sidesNumber * Math.pow(sideWidth,2))/(4 * Math.tan(Math.PI/sidesNumber));
        System.out.printf("Figure surface = %.2f", area);
    }
}
