package chapter_I;

public class Main_1_11 {
    public static void main(String[] args) {

        int years = 5;
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
