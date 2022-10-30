package chapter_II;

import java.util.Scanner;

public class Exercise_2_15 {
    public static void main(String[] args) {
        double x1,y1,x2,y2;

        Scanner inScanner = new Scanner(System.in);
        System.out.println("Specify first point co-ordinates (x1 y1): ");
        x1 = inScanner.nextDouble();
        y1 = inScanner.nextDouble();
        System.out.println("Specify second point co-ordinates (x2 y2): ");
        x2 = inScanner.nextDouble();
        y2 = inScanner.nextDouble();

        System.out.printf("Distance between points: %.2f", calcPointsDistance(x1,y1,x2,y2));
    }
    public static double calcPointsDistance(double x1, double y1, double x2, double y2){

        double pointsDistance = 0.0;
        pointsDistance = Math.sqrt(Math.pow((x2-x1),2)+ Math.pow((y2-y1),2));

        return pointsDistance;
    }
}