package chapter_X.Exercise_10_06;

import chapter_X.StackOfIntegers;

public class Main {
    public static void main(String[] args) {

        StackOfIntegers SoI = new StackOfIntegers(16);

        int number = 1;
        while(number<120) {
            boolean primeNumber = true;
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    primeNumber = false;
                    break;
                }
            }
            if (primeNumber) {
                SoI.push(number);
                System.out.println(number + " is prime number.");
                primeNumber=true;
            }
            number = number +1;
        }
        for(int i= SoI.getSzie();i>0;i--){
            System.out.printf(SoI.pop() + ", ");
        }
    }
}
