package chapter_III;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise_03_15 {
    public static void main(String[] args) {
        int lottery = 0;
        while (lottery < 100) {
            lottery = (int) (Math.random() * 1000);
        }
        int lotteryNum1 = lottery / 100;
        int lotteryNum2 = (lottery - (lotteryNum1 * 100)) / 10;
        int lotteryNum3 = lottery % 10;
        int lotteryArray[] = new int[3];
        lotteryArray[0] = lotteryNum1;
        lotteryArray[1] = lotteryNum2;
        lotteryArray[2] = lotteryNum3;

        System.out.println("Wytypuj liczbe (trzy cyfry): ");

        try {
            Scanner input = new Scanner(System.in);
            int guess = 0;
            guess = input.nextInt();
            if(guess>=100&&guess<=999)
            {
                System.out.println("Wygenerowana liczba to: " + lottery);
                int guessNum1 = guess / 100;
                int guessNum2 = (guess - (guessNum1 * 100)) / 10;
                int guessNum3 = guess % 10;

                int guessArray[] = new int[3];
                guessArray[0] = guessNum1;
                guessArray[1] = guessNum2;
                guessArray[2] = guessNum3;

                boolean guessAll = true;
                boolean guessAtLeasOne = false;

                Arrays.sort(guessArray);
                Arrays.sort(lotteryArray);
                for (int i = 0; i < guessArray.length; i++) {
                    if (guessArray[i] != lotteryArray[i]) {
                        guessAll = false;
                    }
                }
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        if (guessArray[i] == lotteryArray[j])
                            guessAtLeasOne = true;
                    }
                }
                if (guess == lottery) {
                    System.out.println("you gues 3 digits, you won main prize 10 000 $ !");
                } else if (guessAll) {
                    System.out.println("You gues all 3 numbers but in different order ! You won $3,000");
                } else if (guessAtLeasOne) {
                    System.out.println("You guess at least one of three digits, won $1,000");
                } else{
                    System.out.println("Sorry, you didn't guess, try again.");
                }
            }else {
                System.out.println("Number you entered was not from 100 to 999. This game generate 3 digits numbers");
            }
                } catch (InputMismatchException e) {
                    System.out.println("You didnt enter numeric value ?");
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Your number was to shoort");
                }
    }
}