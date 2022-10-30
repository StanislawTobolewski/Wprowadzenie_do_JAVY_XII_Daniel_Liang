package chapter_I;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main_1_12 {

    public static void main(String[] args) {

        int distanceInMiles = 24;
        double distanceInKm = distanceInMiles * 1.6;
        String time = "1:40:35";
        int hours = 0;
        int minutes = 0;
        int seconds = 0;

        String regex = "(?<hours>\\d):(?<minutes>\\d{1,2}):(?<seconds>\\d{1,2})";
        Pattern patTime = Pattern.compile(regex, Pattern.COMMENTS);
        Matcher matcherTime = patTime.matcher(time);

        if (matcherTime.matches()){
            hours = Integer.parseInt(matcherTime.group("hours"));
            minutes = Integer.parseInt(matcherTime.group("minutes"));
            seconds = Integer.parseInt(matcherTime.group("seconds"));
        }
        System.out.println("Time = " + time + " distance in km: " + (int)distanceInKm);
        System.out.printf("Average speed = %.2f km/h", averageSpeed(hours, minutes, seconds, distanceInKm));
    }
    public static double averageSpeed(int h, int m, int s, double dist){
        double sec = 60.0;
        double time = ((h*sec*sec) + (m*sec) + s)/3600;
        return dist/time;
    }
}
