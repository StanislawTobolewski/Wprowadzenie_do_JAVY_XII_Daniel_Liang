package chapter_III;

public class Exercise_03_04 {
    public static void main(String[] args) {

            int randomMonth = (int) ((Math.random() * 130) / 10);

            switch (randomMonth){
                case 1:
                    System.out.printf("January");
                    break;
                case 2:
                    System.out.printf("February ");
                    break;
                case 3:
                    System.out.printf("March");
                    break;
                case 4:
                    System.out.printf("April");
                    break;
                case 5:
                    System.out.printf("May");
                    break;
                case 6:
                    System.out.printf("June");
                    break;
                case 7:
                    System.out.printf("July");
                    break;
                case 8:
                    System.out.printf("August");
                    break;
                case 9:
                    System.out.printf("September");
                    break;
                case 10:
                    System.out.printf("October");
                    break;
                case 11:
                    System.out.printf("November");
                    break;
                case 12:
                    System.out.printf("December");
                    break;
                default:
                    System.out.printf("Error");
                    break;
            }
    }
}
