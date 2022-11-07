package chapter_V;

public class Exercise_05_13 {
    public static void main(String[] args) {
        int x = 20;
        double wynik = 0;

        while (true) {
            if (Math.pow(x + 1, 3) < 12000) {
                x++;
            }else {
                break;
            }
        }
        System.out.printf("x= " + x);
    }
}
