package chapter_III;

public class Exercise_03_21 {
    public static void main(String[] args) {
        int h = 0;  //TO_FIND
        int day = 25;
        int month = 1;
        int year = 2015;

        if(month==1){
            month=13;
            year -=1;
        } else if (month==2) {
            month=14;
            year-=1;
        }

        int j = year/100;
        int k = year%100;

        h = (day + ((26*(month+1))/10) + k + (k/4) + (j/4) + 5 * j )%7;

        dayCalculate(h);
    }
    public static void dayCalculate(int h){
        switch (h){
            case 0:
                System.out.println("Day of week: Saturday (Sobota)");
                break;
            case 1:
                System.out.println("Day of week: Sunday (Niedziela)");
                break;
            case 2:
                System.out.println("Day of week: Monday (Poniedziałek)");
                break;
            case 3:
                System.out.println("Day of week: Tuesday (Wtorek)");
                break;
            case 4:
                System.out.println("Day of week: Wednesday (Środe)");
                break;
            case 5:
                System.out.println("Day of week: Thursday (Czwartek)");
                break;
            case 6:
                System.out.println("Day of week: Friday (Piątek)");
                break;
            default:
                System.out.println("Error occured.");
                break;
        }
    }

}
