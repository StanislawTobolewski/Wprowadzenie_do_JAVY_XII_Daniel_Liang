package chapter_V;

public class Exercise_05_11 {
    public static void main(String[] args) {

        int count = 1;
        for (int i=100;i<=200;i++){
            if((i%5==0||i%6==0)&&i%30!=0){
                System.out.printf(i + " ");
                if(count%10==0){
                    System.out.printf("\n");
                }
                count++;
            }
        }

    }
}
