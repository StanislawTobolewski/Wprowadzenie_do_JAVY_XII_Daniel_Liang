package chapter_III;

public class Exercise_03_08 {
    public static void main(String[] args) {
        int n1 = 9;
        int n2 = 2;
        int n3 = 8;
        int temp;

        if(n1>n2){
            temp = n2;
            n2 = n1;
            n1 = temp;
        }

        if(n2>n3){
            temp = n3;
            n3 = n2;
            n2 = temp;
        }

        if(n1>n3){
            temp = n3;
            n3 = n1;
            n1 = temp;
        }

        System.out.printf(n1 + " " + n2 + " " + n3);


    }
}
