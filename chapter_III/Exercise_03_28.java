package chapter_III;

public class Exercise_03_28 {
    public static void main(String[] args) {
        //to lazy to get those data every time from user by Scanner ...
        Rectangular rect1 = new Rectangular(5, 5, 8, 4);
        Rectangular rect2 = new Rectangular(4, 9, 2, 2);

        Rectangular.checkRectangulars(rect1, rect2);
    }
}
