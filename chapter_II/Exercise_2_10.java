package chapter_II;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise_2_10 {
    public static void main(String[] args) {

        double startTemp, endTemp, mass, energy;
        try {
            Scanner inScanner = new Scanner(System.in);

            System.out.printf("Set start water temperature (C): ");
            startTemp = inScanner.nextDouble();
            System.out.printf("Set end water temperature (C): ");
            endTemp = inScanner.nextDouble();
            System.out.printf("Set water weight (kg): ");
            mass = inScanner.nextDouble();

            energy = mass * (endTemp - startTemp) * 4184;

            System.out.printf("You need %.3f J energy.", energy);
        }
        catch (ArithmeticException e){
            System.out.printf("Arythmetical error");
        } catch (InputMismatchException in){
            System.out.printf("Input data error");
        }
    }
}