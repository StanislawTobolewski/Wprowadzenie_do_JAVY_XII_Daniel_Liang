package chapter_X;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {

        String inputText = "";
        Scanner inScanner = new Scanner(System.in);
        inputText = inScanner.nextLine();
        StringBuilder palindrome = new StringBuilder(inputText);

        System.out.printf(palindrome + "\n");
        System.out.printf(palindrome.reverse()+"\n");

        if((palindrome.toString()).equals(palindrome.reverse().toString())){
            System.out.printf("Input text is a palindrome");
        }else {
            System.out.printf("Input text is not a palindrome");
        }

    }

}
