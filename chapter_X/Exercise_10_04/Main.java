package chapter_X.Exercise_10_04;

public class Main {
    public static void main(String[] args) {
        MyPoint p1 = new MyPoint(2.0,3.0);
        MyPoint p2 = new MyPoint(2.0, 9.0);
        System.out.println(p1.distance(p2));
        System.out.println(p1.distance(2.0,11.0));
        System.out.println(MyPoint.distance(p1,p2));
    }
}
