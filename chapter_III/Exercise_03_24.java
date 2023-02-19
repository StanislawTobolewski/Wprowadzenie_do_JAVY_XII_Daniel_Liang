package chapter_III;

import java.util.Arrays;
import java.util.List;

public class Exercise_03_24 {

    public static void main(String[] args) {

        List<String> cards = Arrays.asList  ("AS", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King");
        System.out.printf("Drawne card: " + cards.get(generateRandom()));
    }
    public static int generateRandom(){
        int rand = (int) (Math.random() * (13 - 0) + 0);
        return rand;
    }
}
