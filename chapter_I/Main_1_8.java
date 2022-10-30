package chapter_I;

public class Main_1_8 {
    public static void main(String[] args) {
        System.out.printf("Circut of circle = %.4f\n",calcCircut(5.5));
        System.out.printf("Surface of circle = %.4f\n",calcSurface(5.5));
    }
    public static double calcSurface(double a){
        return Math.PI * calcSquare(a);
    }
    public static double calcCircut( double a){
        return 2*Math.PI*a;
    }
    public static double calcSquare(double a){
        return a*a;
    }
}
