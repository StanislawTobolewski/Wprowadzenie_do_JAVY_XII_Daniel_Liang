package chapter_V;

import java.util.Scanner;

public class Exercise_05_01 {
    public static void main(String[] args) {

        byte counter = 0;
        int firstNumber = 0;
        int secondNumber = 0;
        Scanner inScanner = new Scanner(System.in);
        int result = 0;
        int points = 0;

        while(counter<10){
            firstNumber = (int)((Math.random()*(15-1))+1);
            secondNumber = (int)((Math.random()*(15-1))+1);
            System.out.printf(firstNumber + " + " + secondNumber + " = ");
            result = inScanner.nextInt();
            if(result==(firstNumber+secondNumber)){
                System.out.printf("Correct answer.\n");
                points++;
            }else{
                System.out.printf("Wrong answer.\n");
            }
            counter++;
        }
        System.out.printf("Your score: %d/10",points);
    }
}
