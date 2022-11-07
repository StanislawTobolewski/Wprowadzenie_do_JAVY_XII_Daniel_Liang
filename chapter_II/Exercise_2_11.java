package chapter_II;

import java.util.Scanner;

public class Exercise_2_11 {
    public static void main(String[] args) {

        int years = 0;

        Scanner inScanner = new Scanner(System.in);
        System.out.printf("Enter number of years for prognose: ");
        years = inScanner.nextInt();

        long actualPopulation = 312_032_486;
        long borned = calcBorn(years);
        long died = calcDied(years);
        long imigrated = calcImigrants(years);
        long futurePopulation;

        futurePopulation = actualPopulation + borned + died + imigrated;
        System.out.printf("Projected population in future %d years : %d people\n",years,futurePopulation);
    }
    public static int calcYearsInSeconds(int years){
        //1h  *   24h/d   *   365 d/y * years
        int seconds = 3600  *   24      *   365     * years;
        return seconds;
    }
    public static long calcBorn(int time){
        return calcYearsInSeconds(time)/7;
    }
    public static long calcDied(int time){
        return (calcYearsInSeconds(time)/13)*(-1);
    }
    public static long calcImigrants(int time) {
        return calcYearsInSeconds(time) / 45;
    }
}
