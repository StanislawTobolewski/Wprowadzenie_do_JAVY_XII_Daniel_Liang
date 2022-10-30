package chapter_IV;

import java.util.Scanner;

public class Exercise_04_09 {
    public static void main(String[] args) {
        Scanner inScanner = new Scanner(System.in);
        char sign = ' ';
        System.out.printf("Specify character: ");
        sign = inScanner.nextLine().charAt(0);
        byte ASCINumber = 0;
        ASCINumber = (byte)sign;

        System.out.printf("Numerical value of %s is: %d",sign, ASCINumber);
    }
}
