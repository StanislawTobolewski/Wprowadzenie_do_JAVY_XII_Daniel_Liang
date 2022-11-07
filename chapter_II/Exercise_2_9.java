package chapter_II;

public class Exercise_2_9 {
    public static void main(String[] args) {
        double a = 0.0;
        double v1, v0, t;

        //symulated input:
        v1 = 5.5;
        v0 = 50.9;
        t = 4.5;

        a = (v1 - v0)/t;

        System.out.printf("Average acceleration: %.3f", a);
    }
}
