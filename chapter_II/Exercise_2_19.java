package chapter_II;

import java.util.Scanner;

public class Exercise_2_19
{
    public static void main(String[] args)   //USE MyPoint Class for points (double) storage and calculation
    {

        MyPoint vertices1 = new MyPoint(1.5,-3.4);  //for tests insert points here
        MyPoint vertices2 = new MyPoint(4.6,5.0);  //for tests insert points here
        MyPoint vertices3 = new MyPoint(9.5,-3.4);  //for tests insert points here

        Scanner inScanner = new Scanner(System.in);

        System.out.printf("Specify triangle vertices separated by spaces\nx1, y1, x2, y2, x3, y3 :");
        vertices1.setX(inScanner.nextDouble());   //user inputs
        vertices1.setY(inScanner.nextDouble());
        vertices2.setY(inScanner.nextDouble());
        vertices2.setY(inScanner.nextDouble());
        vertices3.setY(inScanner.nextDouble());
        vertices3.setY(inScanner.nextDouble());

        System.out.printf("Triangle area: %.2f", MyPoint.calcTriangleArea(vertices1,vertices2,vertices3));
    }
}

