package chapter_I;

public class Main_1_7
{
    public static void main(String[] args) {

        double PI_1, PI_2, PI_3 = Math.PI;

        PI_1 = 4*(1.0-1.0/3+1.0/5-1.0/7+1.0/9-1.0/11);
        PI_2 = 4*(1.0-1.0/3+1.0/5-1.0/7+1.0/9-1.0/11+1.0/13);

        System.out.printf("%.5f", PI_1);
        System.out.println("");
        System.out.printf("%.6f", PI_2);
        System.out.println("");
        System.out.printf("%.7f", PI_3);
    }


}
