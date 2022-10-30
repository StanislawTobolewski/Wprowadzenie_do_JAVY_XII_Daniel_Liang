package chapter_III;

import java.util.Scanner;

public class Exercise_03_18 {
    public static void main(String[] args) {

        double weight = 0.0;
        double price = 0.0;
        Scanner inScanner = new Scanner(System.in);
        System.out.printf("Specify package weight in kg: ");
        weight = inScanner.nextDouble();

        if(weight<=0){
            System.out.printf("Wrong input data.");
        } else if (weight>20) {
            System.out.printf("Package is to heavy.");
        }else {
            if(weight>0&&weight<=1){
                price = 3.5;
            } else if (weight>1&&weight<=3) {
                price = 5.5;
            } else if (weight>3&&weight<=10) {
                price = 8.5;
            } else if (weight>10&&weight<-20) {
                price = 10.5;
            }
            System.out.printf("Price for package (%.2f kg) is : %.2f",weight,price);
        }
    }
}
