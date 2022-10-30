package chapter_I;

public class Main_1_10 {
    public static void main(String[] args) {

        double distanceInKm = 14;
        // 45 min 30 sec;
        double timeMinutes = 45.0;
        double timesSeconds = 30.0;

        System.out.printf("Speed= %.1f MPH", calculateAverageSpeed(timeMinutes,timesSeconds,distanceInKm));

    }
    public static double calculateAverageSpeed(double min, double sec, double dist){
        double timeInSec =  ((min * 60) + sec)/3600;
        double averageSpeed = distanceInKmToMiles(dist) / timeInSec;
        return averageSpeed;
    }
    public static double distanceInKmToMiles(double dist){
        return dist/ 1.6;
    }

}
