package chapter_II;

import java.util.Scanner;

public class Exercise_2_5 {
    public static void main(String[] args) {

        int price = 0;
        int tip = 0;
        double priceWithTip = 0.0;
        Scanner inScanner = new Scanner(System.in);
        price = inScanner.nextInt();
        tip = inScanner.nextInt();

        priceWithTip = calcPriceWithTip(price, tip);
        System.out.printf("Price: %d$, tip: %d%%, price with tip: %.2f $",price, tip, priceWithTip);

    }

    public static double calcPriceWithTip(int price, int tip){
        return price + (price * (tip/100.0));
    }


}
