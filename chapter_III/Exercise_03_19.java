package chapter_III;

import java.util.Scanner;

public class Exercise_03_19 {
    public static void main(String[] args) {

        Scanner inScanner = new Scanner(System.in);
        double sideA, sideB, sideC;

        System.out.printf("Specify 3 sides of triangle: ");
        sideA = inScanner.nextDouble();
        sideB = inScanner.nextDouble();
        sideC = inScanner.nextDouble();

        double temp = 0.0;
        while(sideA>sideB||sideB>sideC||sideA>sideC) {
            if (sideA > sideB) {
                temp = sideA;
                sideA = sideB;
                sideB = temp;
            }
            if (sideC < sideB) {
                temp = sideC;
                sideC = sideB;
                sideB = temp;
            }
            if (sideA > sideC) {
                temp = sideC;
                sideC = sideA;
                sideA = temp;
            }
        }
        if((sideA+sideB)>sideC){
            System.out.printf("Circuit = " + (sideA+sideB+sideC));
        }
    }
}
