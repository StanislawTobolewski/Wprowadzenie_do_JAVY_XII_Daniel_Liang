package chapter_IV;

public class Exercise_04_16 {
    public static void main(String[] args) {
        int randomSign = 0;

        randomSign = (int) (Math.random() * 122);
        while(randomSign<65||(randomSign>90&&randomSign<=96)||randomSign>122) {
            randomSign = (int) (Math.random() * 122);
        }
        char sign = (char)randomSign;
        System.out.printf(sign + "\t");
    }
}
