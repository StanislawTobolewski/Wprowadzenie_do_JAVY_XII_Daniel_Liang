package chapter_II;

import java.util.Scanner;

public class Exercise_2_8 {


        public static void main(String[] args) {

            Scanner inScanner = new Scanner(System.in);
            short timeZone = 0;

            System.out.printf("GMT time zone diference: ");
            timeZone = inScanner.nextShort();

            long totalMiliseconds = System.currentTimeMillis();

            long totalSeconds = totalMiliseconds/1000;
            long actualSecond = totalSeconds%60;

            long totalMinutes = totalSeconds/60;
            long actualMinute = totalMinutes%60;

            long totalHours = totalMinutes/60;
            long actualHour = (totalHours+timeZone)%24;


            // + 2 Time zone
            System.out.println("Actual time: " + (actualHour)+":"+actualMinute+":"+actualSecond);


    }


}
