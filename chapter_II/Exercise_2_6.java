package chapter_II;

import java.util.Scanner;

public class Exercise_2_6 {
    public static void main(String[] args) {

        int numberToCalc = 0;
        int z,y,x;
        int sum = 0;
        Scanner inScanner = new Scanner(System.in);
        System.out.printf("Insert number (0 - 1000) to calculate: ");
        numberToCalc = inScanner.nextInt();

        if(numberToCalc>=1000||numberToCalc<=0){
            System.out.printf("Input number not from 0 to 1000 range !");
        } else {
            x = numberToCalc%10;
            y = (numberToCalc/10)%10;
            z = (numberToCalc/100)%10;
            sum = x+y+z;
            System.out.printf("Sum of the digits of number:% d is: %d", numberToCalc, sum);

        }

    }
}
