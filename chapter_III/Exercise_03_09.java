package chapter_III;

public class Exercise_03_09 {
    public static void main(String[] args) {

        //symulated user input:
        //Scanner inScanner = new Scanner(System.in);
        //String inputISBN = inScanner.nextLine();

        String inputISBN = "013601267";     //with checksumm different than 10
        //String inputISBN = "013031997";  //with checkSum = 10

        int checkSumISBN = 0;

        if(inputISBN.length()==9) {

            int d1, d2, d3, d4, d5, d6, d7, d8, d9;
            d1 = Integer.valueOf(inputISBN.substring(0, 1));
            d2 = Integer.valueOf(inputISBN.substring(1, 2));
            d3 = Integer.valueOf(inputISBN.substring(2, 3));
            d4 = Integer.valueOf(inputISBN.substring(3, 4));
            d5 = Integer.valueOf(inputISBN.substring(4, 5));
            d6 = Integer.valueOf(inputISBN.substring(5, 6));
            d7 = Integer.valueOf(inputISBN.substring(6, 7));
            d8 = Integer.valueOf(inputISBN.substring(7, 8));
            d9 = Integer.valueOf(inputISBN.substring(8, 9));
            // TEST System.out.printf("d1 = %d, d2 = %d, d3 = %d, d4 = %d, d5 = %d, d6 = %d, d7 = %d, d8 = %d, d9 = %d, ", d1,d2,d3,d4,d5,d6,d7,d8,d9);

            checkSumISBN = ((d1 * 1) + (d2 * 2) + (d3 * 3) + (d4 * 4) + (d5 * 5) + (d6 * 6) + (d7 * 7) + (d8 * 8) + (d9 * 9)) % 11;

            if (checkSumISBN == 10) {
                System.out.printf("Numer ISBN-10 is: %sX", inputISBN);
            } else {
                inputISBN = inputISBN.concat(Integer.toString(checkSumISBN).substring(0, 1));
                System.out.printf("Numer ISBN-10 is: %s", inputISBN);
            }
        }else {
            System.out.println("Wrong ISBN-10 number, please check it");
        }
    }
}