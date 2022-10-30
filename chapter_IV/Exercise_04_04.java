package chapter_IV;

import java.util.Scanner;

public class Exercise_04_04 {
    public static void main(String[] args) {
        double side = 0.0;
        double area = 0.0;
        Scanner inScanner = new Scanner(System.in);
        System.out.printf("Specify hexagon side width: ");

        side = inScanner.nextDouble();
        area = (6*Math.pow(side,2))/(4 * Math.tan(Math.PI/6));
        System.out.printf("Hexagon area: %.2f", area);
    }
}
