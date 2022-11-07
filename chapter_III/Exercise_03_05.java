package chapter_III;

public class Exercise_03_05 {
    public static void main(String[] args) {
        //Symulated user input -> I'm lazy
        int actualDay = 0;
        int futureDay = 15;
        int calculatedDay = 0;

        calculatedDay = (futureDay+(actualDay))%7;

        System.out.printf("Today is %s after %d will be %s",calcDay(actualDay),futureDay, calcDay(calculatedDay));
    }
    public static String calcDay(int day){
        String dayOfWeek = "";
        switch (day){
            case 0:
                dayOfWeek = "Sunday";
                break;
            case 1:
                dayOfWeek ="Monday";
                break;
            case 2:
                dayOfWeek ="Tuesdayy";
                break;
            case 3:
                dayOfWeek ="Wednesday";
                break;
            case 4:
                dayOfWeek ="Thursday";
                break;
            case 5:
                dayOfWeek ="Friday";
                break;
            case 6:
                dayOfWeek ="Saturday";
                break;
            default:
                dayOfWeek ="Error";
                break;
        }
        return dayOfWeek;
    }
}