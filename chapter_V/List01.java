package chapter_V;

import java.util.ArrayList;
import java.util.Scanner;

public class List01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System. in) ;
        ArrayList<Integer> numbers = new ArrayList<> () ;
        int start = 0;
        int end = 0;

        while (true) {
        int number = Integer.valueOf(scanner.nextLine()) ;
        if (number == -1) {
            break;
        }
            numbers.add(number);
        }

        System.out.printf("Start & end: ");
        start = scanner.nextInt();
        end = scanner.nextInt();

        for(int i = start;i<=end;i++){
            System.out.println(numbers.get(i));
        }

    }
}
