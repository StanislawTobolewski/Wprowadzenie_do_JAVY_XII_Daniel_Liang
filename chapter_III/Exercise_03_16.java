package chapter_III;

import java.util.Random;

public class Exercise_03_16 {
    public static void main(String[] args) {

        Random rand = new Random();
        int rectWidth = 100;
        int rectHeight = 200;
        byte rX = (byte) (((rand.nextBoolean() == true)) ? 1 : -1);
        byte rY = (byte) (((rand.nextBoolean() == true)) ? 1 : -1);

        double x = ((Math.random()*rectWidth)/2)*rX;
        double y = ((Math.random()*rectHeight)/2)*rY;

        System.out.printf("Point inside rectangular with center at 0,0, width %d and height %d: \nx = %.2f, y = %.2f", rectWidth, rectHeight,x,y);
    }
}
