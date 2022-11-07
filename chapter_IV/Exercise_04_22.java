package chapter_IV;

public class Exercise_04_22 {
    public static void main(String[] args) {
        String mainText = "ABCD";
        String testText = "CB";

        String answer = "";

        answer = (mainText.contains(testText))? "Main text contains test string" : "Main text does not contain tested string";
        System.out.printf(answer);
    }
}
