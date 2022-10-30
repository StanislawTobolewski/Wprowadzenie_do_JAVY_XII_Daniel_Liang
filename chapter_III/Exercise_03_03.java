package chapter_III;

public class Exercise_03_03 {
    public static void main(String[] args) {


        //Symulated user input fo not write it every test ...
        double a = 1.0;
        double b = 2.0;
        double c = 2.0;
        double d = 4.0;
        double e = 4.0;
        double f = 5.0;

        double equasionTest = (a*d)-(b*c);

        if(equasionTest==0){
            System.out.printf("The equation has no solution");
        }else{
            double x = (e*d - b*f)/(a*d - b*c);
            double y = (a*f - e*c)/(a*d - b*c);

            System.out.printf("X = %.2f, Y = %.2f.",x,y);
        }


    }
}
