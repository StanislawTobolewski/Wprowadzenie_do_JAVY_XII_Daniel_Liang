package chapter_II;

import java.util.Scanner;

public class Exercise_2_22 {

    public static void main(String[] args) {

        int moneyAmount = 0;

        Scanner inScanner = new Scanner(System.in);
        System.out.printf("Specify cash ammount (without coma): ");
        moneyAmount = inScanner.nextInt();

        calcBilon(moneyAmount);
    }

    public static void calcBilon(int moneyAmount){
        // 1 dol, 25c, 10c, 5c, 1c
        int dolar, cent25, cent10, cent5, cent1;

        dolar = moneyAmount/100;
        moneyAmount = moneyAmount - 100*dolar;

        cent25 = moneyAmount/25;
        moneyAmount = moneyAmount-cent25*25;

        cent10 = moneyAmount/10;
        moneyAmount = moneyAmount-cent10*10;

        cent5 = moneyAmount/5;
        moneyAmount = moneyAmount-cent5*5;

        cent1 = moneyAmount/1;
        moneyAmount = moneyAmount-cent1*1;

        System.out.printf("To give the change of: %d you will need: \n", moneyAmount);
        System.out.println("1 \tdolar coins: \t" + dolar);
        System.out.println("25 \tcent coins: \t" + cent25);
        System.out.println("10 \tcent coins: \t" + cent10);
        System.out.println("5 \tcent coins: \t" + cent5);
        System.out.println("1 \tcent coins: \t" + cent1);

    }
}
