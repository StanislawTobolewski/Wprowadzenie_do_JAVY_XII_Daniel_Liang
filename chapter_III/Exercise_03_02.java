package chapter_III;

import java.util.Scanner;

public class Exercise_03_02 {
    public static void main(String[] args) {

        //byte not int to save memory ;D
        byte firstNumber = 0;
        byte secondNumber = 0;
        byte thirdNumber = 0;
        byte answer = 0;

        firstNumber = (byte)(Math.random()*10);
        secondNumber = (byte)(Math.random()*10);
        thirdNumber = (byte)(Math.random()*10);

        System.out.printf("Specify answer: %d + %d + %d = ", firstNumber, secondNumber, thirdNumber);

        Scanner inScanner = new Scanner(System.in);
        answer = inScanner.nextByte();

        if(answer == (firstNumber+secondNumber+thirdNumber)){
            System.out.printf("Answer correct");
        } else {
            System.out.printf("Wrong answer");
        }


    }
}
