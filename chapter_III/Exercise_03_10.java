package chapter_III;

import java.util.Scanner;

public class Exercise_03_10 {
    public static void main(String[] args) {

        int firstNumber = 0;
        int secondNumber = 0;
        int guesNumber = 0;

        firstNumber = (int)(Math.random()*100);
        secondNumber = (int)(Math.random()*100);

        System.out.printf("%d + %d = ", firstNumber, secondNumber);
        Scanner inScanner = new Scanner(System.in);
        guesNumber = inScanner.nextInt();

        if(guesNumber == (firstNumber+secondNumber)){
            System.out.printf("Wynik poprawny !");
        }else{
            System.out.printf("Wynik błędny.");
        }



    }
}
