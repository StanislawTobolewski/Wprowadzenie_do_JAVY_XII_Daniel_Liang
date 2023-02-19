package chapter_III;

import java.util.Scanner;

public class Exercise_03_33 {
    public static void main(String[] args) {
        Scanner inScanner = new Scanner(System.in);
        double price1,price2,weight1,weight2;
        System.out.println("Specify weight(g) and price of first product: ");
        weight1 = inScanner.nextDouble();
        price1 = inScanner.nextDouble();
        System.out.println("Specify weight(g) and price of second product: ");
        weight2 = inScanner.nextDouble();
        price2 = inScanner.nextDouble();
        if(price1*(1000.0/weight1) < price2*(1000.0/weight2)){
            System.out.println("First product price is better for you.");
        } else if(price1*(1000.0*weight1) > price2*(1000.0*weight2)) {
            System.out.println("Second product price is better for you.");
        } else {
            System.out.println("Same price");
        }
        System.out.println("1: " + (price1*(1000.0/weight1)));
        System.out.println("2: " + (price2*(1000.0/weight2)));
    }
}
