package chapter_IV;

public class Exercise_04_19 {
    public static void main(String[] args) {

        int[] isbn = new int[9];
        double checkSum = 0.0;
        String inputISBN = "013601267";     //with checksumm different than 10 -> 1
        //String inputISBN = "013031997";  //with checkSum = 10

        System.out.println("Input ISBN: " + inputISBN + "\n");

        checkSum = calculateCheckSum(isbn,inputISBN);

        checkSumTester(checkSum, inputISBN);
    }

    public static double calculateCheckSum(int[] isbn, String inputISBN){
        double chSum = 0.0;

        for(int i=0;i<inputISBN.length();i++){
            isbn[i] = Character.getNumericValue(inputISBN.charAt(i));
        }
        for(int i=0;i<isbn.length;i++){
            chSum = chSum + (isbn[i] * (i+1));
        }
        chSum = chSum % 11;
        return  chSum;
    }
    public static void checkSumTester(double checkSum, String inputISBN){
        if (checkSum == 10) {
            System.out.printf("Numer ISBN-10 is: %sX", inputISBN);
        } else {
            System.out.printf("Numer ISBN-10 is: %s%d", inputISBN,(byte)checkSum);
        }
    }
}
