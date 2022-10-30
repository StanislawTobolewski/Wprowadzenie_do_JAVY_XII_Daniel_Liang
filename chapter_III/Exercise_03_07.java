package chapter_III;

import java.util.Scanner;

public class Exercise_03_07 {

        public static void main(String[] args) {

            double moneyAmount = 0;

            Scanner inScanner = new Scanner(System.in);
            System.out.printf("Specify cash ammount: ");
            moneyAmount = inScanner.nextDouble();


            calcBilon(moneyAmount);
        }

        public static void calcBilon(double moneyAmount){
            // 1 dol, 25c, 10c, 5c, 1c
            int dolar, cent25, cent10, cent5, cent1;

            dolar = (int)moneyAmount/1;
            moneyAmount = moneyAmount - dolar;

            cent25 = (int)(moneyAmount/0.25);
            moneyAmount = moneyAmount-cent25*0.25;

            cent10 = (int)(moneyAmount/0.10);
            moneyAmount = moneyAmount-cent10*0.10;

            cent5 = (int)(moneyAmount/0.05);
            moneyAmount = moneyAmount-cent5*0.05;

            cent1 = (int)(moneyAmount/0.01);
            moneyAmount = moneyAmount-cent1*0.01;

            System.out.printf("To give the change you will need: \n", moneyAmount);
            System.out.printf(((dolar!=0)? ("1 \tdolar coins: \t" + dolar) :""));
            System.out.printf(((cent25!=0)? ("\n25 \tcent coins: \t" + cent25) : ""));
            System.out.printf(((cent10!=0)? ("\n10 \tcent coins: \t" + cent10) : ""));
            System.out.printf(((cent5!=0)? ("\n5 \tcent coins: \t" + cent5) : ""));
            System.out.printf(((cent1!=0)? ("\n1 \tcent coins: \t" + cent1) : ""));

        }
    }

