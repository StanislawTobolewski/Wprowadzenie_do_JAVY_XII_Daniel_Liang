package chapter_III;


import java.awt.*;

public class Exercise_03_32 {
    public static void main(String[] args) {


        Point_03_32 p0 = new Point_03_32(1, 1);
        Point_03_32 p1 = new Point_03_32(5, 5);
        Point_03_32 p2 = new Point_03_32(2, 2);

        double location = ((p1.getX() - p0.getX()) * (p2.getY() - p0.getX())) - ((p2.getX() - p0.getX()) * (p1.getY() - p0.getY()));

        if (location > 0) {
            System.out.println("left");
        } else if (location == 0) {
            System.out.println("On");
        } else if (location<0) {
            System.out.println("Right");
        }
    }
}
