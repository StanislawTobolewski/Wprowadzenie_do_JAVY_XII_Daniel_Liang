package chapter_IV;

import java.util.Scanner;

public class Exercise_04_02 {
    public static void main(String[] args) {

        final double earthRadius = 6371.01;
        double distance = 0.0;
        Point_04_02 point1 = new Point_04_02(39.55, -116.25);
        Point_04_02 point2 = new Point_04_02(41.5, 87.37);
        System.out.printf("Specify firs point co-ordinates: ");
        Scanner inScanner = new Scanner(System.in);
        point1.setX(inScanner.nextDouble());
        point1.setY(inScanner.nextDouble());
        System.out.printf("Specify second point co-ordinates: ");
        point2.setX(inScanner.nextDouble());
        point2.setY(inScanner.nextDouble());


        System.out.printf("Distance between points = %.2f",Point_04_02.calculateDistance(point1, point2, earthRadius));
    }

}
