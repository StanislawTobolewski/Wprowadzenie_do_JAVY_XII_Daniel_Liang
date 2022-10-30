package chapter_III;

import java.util.Random;
import java.util.Scanner;

public class Exercise_03_14 {
    public static void main(String[] args) {

        Random rand = new Random();
        boolean headsOrTailsRandom =  rand.nextBoolean();
        byte headOrTails = (byte)((headsOrTailsRandom==true)?1:0);
        byte answer = 0;

        Scanner inScanner = new Scanner(System.in);
        System.out.printf("Guest heads or tails ? (0 or 1): ");
        answer = inScanner.nextByte();

        if(answer == headOrTails){
            System.out.printf("GOOD ANSWER !!! ;D");
        }else{
            System.out.printf("WRONG !!! ;D");
        }

    }
}
