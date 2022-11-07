package chapter_II;

import java.util.Scanner;

public class Exercise_2_2 {
    public static void main(String[] args) {
        double h = 0.0;
        double r = 0.0;
        double PI = Math.PI;
        Scanner input = new Scanner(System.in);
        System.out.printf("Cylinder height: ");
        h = input.nextDouble();
        System.out.printf("\nCylinder radius: ");
        r = input.nextDouble();

        System.out.printf("Base area = %.2f\n", calcBaseArea(r,PI));
        System.out.printf("Volume = %.2f\n", calcVolume(r,PI,h));

    }

    public static double calcBaseArea(double r, double PI){
        return PI * Math.pow(r,2);
    }
    public static double calcVolume(double r, double PI, double h){
        return calcBaseArea(r,PI) * h;
    }


}
