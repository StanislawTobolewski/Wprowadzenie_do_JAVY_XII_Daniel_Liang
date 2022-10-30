package chapter_II;

import java.util.Scanner;

public class Exercise_2_12 {
    public static void main(String[] args) {

        Scanner inScanner = new Scanner(System.in);
        System.out.printf("Please specify plane input values for start speed & plane acceleration: ");
        double startSpeed = inScanner.nextFloat();
        double acceleration = inScanner.nextFloat();

        System.out.printf("Minimal Airstrip length for your plane is: %.2f", calcAirStripLength(startSpeed,acceleration));
    }
    public static double calcAirStripLength(double speed, double accel){
        return Math.pow(speed,2)/(2*accel);
    }
}
