package chapter_I;

public class Main_1_9 {
    public static void main(String[] args) {

        double a=4.5, b =7.9;

        System.out.printf("Surface = \t%.3f\n", calcSurface(a,b));
        System.out.printf("Circut = \t%.3f", calcCircut(a,b));

    }

    public static double calcSurface(double a, double b){
        return a*b;
    }
    public static double calcCircut(double a, double b){
        return 2*a+2*b;
    }
}
