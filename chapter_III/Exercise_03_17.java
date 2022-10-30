package chapter_III;

import java.util.Scanner;

public class Exercise_03_17 {
    public static void main(String[] args) {

        //0 - scisors, 1 - stone, 2 - paper;

        byte compDraw = (byte)(Math.random()*3);
        System.out.println("0 - scisors, 1 - stone, 2 - paper");
        Scanner inScanner = new Scanner(System.in);
        byte userDraw = inScanner.nextByte();

        if(userDraw>=0&&userDraw<=2){
            System.out.println("Comp choose: " + compDraw);
            switch (userDraw) {
                case 0:
                    if (compDraw == 0) {
                        System.out.printf("Comp choose scisors, user choose scisors Remis");
                    } else if (compDraw == 1) {
                        System.out.printf("Comp choose stone, user choose scisors Comp won");
                    } else if (compDraw == 2) {
                        System.out.printf("Comp choose paper, user choose scisors User won");
                    }
                    break;
                case 1:
                    if (compDraw == 0) {
                        System.out.printf("Comp choose scisors, user choose stone User won");
                    } else if (compDraw == 1) {
                        System.out.printf("Comp choose stone, user choose stone Remis");
                    } else if (compDraw == 2) {
                        System.out.printf("Comp choose paper, user choose stone Comp won");
                    }
                    break;
                case 2:
                    if (compDraw == 0) {
                        System.out.printf("Comp choose scisors, user choose paper Comp won");
                    } else if (compDraw == 1) {
                        System.out.printf("Comp choose stone, user choose paper User won");
                    } else if (compDraw == 2) {
                        System.out.printf("Comp choose paper, user choose paper Remis");
                    }
                    break;
                default: {
                    break;
                    }
                }
            }else{
            System.out.print("Number you enter is not from 0 to 2");
        }
    }
}
