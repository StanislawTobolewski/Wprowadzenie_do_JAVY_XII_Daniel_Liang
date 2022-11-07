package chapter_III;

public class Exercise_03_11 {
    public static void main(String[] args) {
        int month = 3;
        int year = 2015;

        switch (month){
            case 1:
                System.out.printf("January" + year + "31 days");
                break;
            case 2:
                if((year%4==0)&&(year%100!=0)||(year%400==0)){
                    System.out.printf("Fadruary " + year + "2 9 days");
                    break;
                }
                else{
                    System.out.printf("February " + year + " 28 days");
                    break;
                }

            case 3:
                System.out.printf("March " + year + " 31 days");
                break;
            case 4:
                System.out.printf("April " + year + " 30 days");
                break;
            case 5:
                System.out.printf("May " + year + " 31 days");
                break;
            case 6:
                System.out.printf("June " + year + " 30 days");
                break;
            case 7:
                System.out.printf("July " + year + " 31 days");
                break;
            case 8:
                System.out.printf("August " + year + " 31 days");
                break;
            case 9:
                System.out.printf("September " + year + " 30 days");
                break;
            case 10:
                System.out.printf("October " + year + " 31 days");
                break;
            case 11:
                System.out.printf("November " + year + " 30 days");
                break;
            case 12:
                System.out.printf("December " + year + " 31 days");
                break;
        }
    }
}
