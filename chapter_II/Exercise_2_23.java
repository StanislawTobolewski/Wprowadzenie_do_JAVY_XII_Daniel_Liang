package chapter_II;

import java.util.Scanner;

public class Exercise_2_23 {
    public static void main(String[] args) {

        double distanceToDrive = 0.0;
        double combustionPer100km = 0.0;
        double fuelPrice = 0.0;
        double overallFuelCost = 0.0;

        Scanner inScanner = new Scanner(System.in);

        System.out.printf("Specify distance do drive: ");
        distanceToDrive = inScanner.nextDouble();
        System.out.printf("Specify fuel combustion per 100 km : ");
        combustionPer100km = inScanner.nextDouble();
        System.out.printf("Specify fuel price: ");
        fuelPrice = inScanner.nextDouble();

        overallFuelCost = combustionPer100km * (distanceToDrive/100) * fuelPrice;

        System.out.printf("Overall fuel cost for your trip will be: %.2f $", overallFuelCost);



    }
}
