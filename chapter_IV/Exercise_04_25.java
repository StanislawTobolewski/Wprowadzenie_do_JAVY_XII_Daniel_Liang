package chapter_IV;

import java.util.Random;

public class Exercise_04_25 {
    public static void main(String[] args) {

        Random rand = new Random();
        char firstCharacter = (char)rand.nextInt(65, 90);
        char secondCharacter = (char)rand.nextInt(65, 90);
        char thirdCharacter = (char)rand.nextInt(65, 90);
        char firstNumber = (char)rand.nextInt(48, 57);
        char secondNumber = (char)rand.nextInt(48, 57);
        char thirdNumber = (char)rand.nextInt(48, 57);
        char fourthNumber = (char)rand.nextInt(48, 57);



        System.out.println("Plate number: [" +firstCharacter+secondCharacter+thirdCharacter+" "+firstNumber+secondNumber+thirdNumber+fourthNumber+"]");



    }
}
