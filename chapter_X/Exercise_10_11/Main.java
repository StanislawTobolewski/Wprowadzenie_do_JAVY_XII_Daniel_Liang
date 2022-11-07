package chapter_X.Exercise_10_11;

public class Main {
    public static void main(String[] args) {
        Circle2D c1 = new Circle2D(0,0,3.0);
        Circle2D c2 = new Circle2D(0,6,4.0);

        System.out.println(c1.overlaps(c2));

    }
}
