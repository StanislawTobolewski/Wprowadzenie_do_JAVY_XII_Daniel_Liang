package chapter_II;

public class Exercise_2_7 {

    public static void main(String[] args) {
        long totalMiliseconds = System.currentTimeMillis();

        long totalSeconds = totalMiliseconds/1000;
        long actualSecond = totalSeconds%60;

        long totalMinutes = totalSeconds/60;
        long actualMinute = totalMinutes%60;

        long totalHours = totalMinutes/60;
        long actualHour = totalHours%24;

                                               // + 2 Time zone
        System.out.println("Actual timme: " + (actualHour+2)+":"+actualMinute+":"+actualSecond);

    }

}
