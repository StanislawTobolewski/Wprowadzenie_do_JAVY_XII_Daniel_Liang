package chapter_IX;

public class Exercise_09_01 {
    public static void main(String[] args) {

        Rectangular_09_01 rect1 = new Rectangular_09_01(4, 40);
        Rectangular_09_01 rect2 = new Rectangular_09_01(3.5, 35.9);

        System.out.println("Rect 1 area = " + rect1.getArea());
        System.out.println("Rect 1 perimeter = " + rect1.getPerimeter());
        System.out.println("Rect 2 area = " + rect2.getArea());
        System.out.println("Rect 2 perimeter = " + rect2.getPerimeter());


    }
}
