package chapter_IV;

import java.util.Scanner;

public class Exercise_04_01 {
    public static void main(String[] args) {

        double radius = 0.0;
        double s = 0.0;
        double area = 0.0;
        final double PI = Math.PI;
        final double SIN = Math.sin(PI/5);
        final double TAN = Math.tan(PI/5);

        Scanner inScanner = new Scanner(System.in);
        System.out.printf("Specify radius: ");

        radius = inScanner.nextDouble();

        if(radius>0){
            s = 2*radius*SIN;
            area = (5*Math.pow(s,2))/(4*TAN);
            System.out.printf("Area = %.2f", area);

        }else {
            System.out.printf("Radius is 0 or less.");
        }



    }
    
}
