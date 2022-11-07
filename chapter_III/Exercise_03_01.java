package chapter_III;

import java.util.Scanner;

public class Exercise_03_01 {
    public static void main(String[] args) {
        double a = 1,b = 2,c = 3;
        Scanner inScanner = new Scanner(System.in);

        /*System.out.printf("Specify a, b, c: ");
        a = inScanner.nextDouble();
        b = inScanner.nextDouble();
        c = inScanner.nextDouble();*/

        double equationDiscriminant = 0.0;

        equationDiscriminant = Math.sqrt(Math.pow(b,2)-4*1*c);

        if(equationDiscriminant>0){
            System.out.printf("Equation have 2 roots: \nR1 = %.3f and R2 = %.3f", calcRootOne(a,b,c), calcRootTwo(a,b,c));
        }else if(equationDiscriminant==0){
            System.out.printf("Equation have 1 root: \nR1 = %.3f", calcRootOne(a,b,c));
        } else{
            System.out.printf("Equation have no roots.");
        }
    }

    public static double calcRootOne(double a, double b, double c){
        double root = -b + (Math.pow((Math.pow(b,2)-4.0*a*c),0.5));
        root = root / 2.0 * a;
        return root;
    }

    public static double calcRootTwo(double a, double b, double c){
        double root = -b - (Math.pow((Math.pow(b,2)-4.0*a*c),0.5));
        root = root / 2.0 * a;
        return root;
    }


}