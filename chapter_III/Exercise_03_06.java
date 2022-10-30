package chapter_III;

public class Exercise_03_06 {
    public static void main(String[] args) {
        //Symulated user input (Scanner inScanner = new Scanner(System.in);
        //bla bla bla ...
        double funtWeight = 140;
        int feetHeight = 5;
        double inchHeight = 10;

        final double KG_PER_POUND = 0.45359237;
        final double METERS_PER_FEET = 0.3048;
        final double METERS_PER_INCH = 0.0254;

        double BMI;
        double heightSquare = 0.0;
        heightSquare = Math.pow((feetHeight*METERS_PER_FEET+inchHeight*METERS_PER_INCH),2);

        BMI = (funtWeight*KG_PER_POUND)/heightSquare;
        System.out.printf("BMI = %.2f\n", BMI);

        if(BMI<18.5){
            System.out.printf("Underweight");
        }else if (BMI>=18.5&&BMI<25.0){
            System.out.printf("Normal weight");
        } else if (BMI>=25.0&&BMI<30) {
            System.out.printf("Overweight");
        }else if(BMI>=30){
            System.out.printf("Obesity");
        }
    }
}
