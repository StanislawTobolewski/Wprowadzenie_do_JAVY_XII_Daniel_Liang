package chapter_IV;

import java.util.Scanner;

public class Exercise_04_08 {
    public static void main(String[] args) {

        byte ASCIsign = 0;
        Scanner inScanner = new Scanner(System.in);
        System.out.printf("Specify ASCI code: ");
        ASCIsign = inScanner.nextByte();

        char ASCIchar = (char)ASCIsign;

        System.out.printf("Character of ASCI code: %d is %s",ASCIsign, ASCIchar);

    }
}
