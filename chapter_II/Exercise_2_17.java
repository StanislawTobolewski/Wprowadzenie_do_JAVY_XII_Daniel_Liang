package chapter_II;

import java.util.Scanner;

public class Exercise_2_17 {
    private static double temp = 0.0;
    private static double windSpeed = 0.0;
    private static final double firsConstant = 13.12;
    private static final double secondConstant = 0.6215;
    private static final double thirdConstant = 11.37;
    private static final double fourthConstant = 0.3965;

    public static void main(String[] args) {

        Scanner inScanner = new Scanner(System.in);
        System.out.printf("Specify temperature (between -50℃ and 5℃ ): ");
        temp = inScanner.nextDouble();
        System.out.printf("Specify wind speed (more than 3.2): ");
        windSpeed = inScanner.nextDouble();

        System.out.printf("Sensed temperature is about: %.2f", calcSensedTemp(temp, windSpeed));
    }
    public static double calcSensedTemp(double temp, double windSpeed){
        double sensedTemp = 0.0;
        if(windSpeed>=3.2)
            {
                if(temp>=-50&&temp<5)
                {
                    sensedTemp = firsConstant + (secondConstant  * temp) - (thirdConstant * Math.pow(windSpeed,0.16)) + (fourthConstant * temp * Math.pow(windSpeed,0.16));
                }
                else
                {
                    System.out.printf("Temperature need to be between -50℃ and 5℃");
                }
            }
            else
            {
                System.out.printf("Wind speed to low to calculate sensed temperature.");
            }
            return sensedTemp;
        }
}