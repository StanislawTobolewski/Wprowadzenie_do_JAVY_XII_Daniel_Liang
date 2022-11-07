package chapter_III;

public class Exercise_03_12 {
    public static void main(String[] args) {

        int number = 050;
        number = Math.abs(number);
        String testNumber = Integer.toString(number);

        try {

            if (testNumber.substring(0, 1).equals(testNumber.substring(2, 3))) {
                System.out.printf("Palindrome.");
            } else {
                System.out.printf("Not a plaindrome.");
            }
        }
        catch (ArithmeticException e){
            System.out.printf("error");
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.printf("wrong number ( zero at the beginig? ).");
        } catch (StringIndexOutOfBoundsException e){
            System.out.printf("wrong number ( zero at the beginig? ).");
        }
    }
}
