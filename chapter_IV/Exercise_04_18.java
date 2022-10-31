package chapter_IV;

import java.util.Scanner;

public class Exercise_04_18 {
    public static void main(String[] args) {
        Scanner inScanner = new Scanner(System.in);
        String path = "";
        System.out.println("M - Math, I - Information technology, T - Computer technology");
        System.out.printf("Field of study and year: ");
        path = inScanner.nextLine();
        char field = path.charAt(0);
        byte year = Byte.valueOf(String.valueOf(path.charAt(1)));
        if (year>0&&year<=5) {
            String type = "";
            if(year>0&&year<=3){
                type = "licenciate";
            } else {
                type = "Master";
            }

            switch (field) {
                case 'M':
                    System.out.printf("Math %d year %s", year, type);
                    break;
                case 'I':
                    System.out.printf("Information technology %d year %s", year, type);
                    break;
                case 'T':
                    System.out.printf("Computer technology %d year %s", year, type);
                    break;
                default:
                    System.out.printf("No study path with that name");
                    break;
            }
        }
        else {
            System.out.printf("Input data error...");
        }
    }
}
