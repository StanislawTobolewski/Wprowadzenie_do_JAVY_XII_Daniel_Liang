package chapter_V;

public class Exercise_05_07 {
    public static void main(String[] args) {
        double tuition = 10_000;
        double tuitionAfterTenYears = 0.0;
        double tuitionPercent = 0.05;
        double tuitionFee = 0.0;

        for(int i=0;i<14;i++) {
            tuition = tuition + (tuition * tuitionPercent);
            if (i == 9) {
                tuitionAfterTenYears = tuition;
            }
            if (i > 9) {
                tuitionFee += tuition;
            }
        }
        System.out.printf("Tuition after 10 years %.2f", tuitionAfterTenYears);
        System.out.printf("\nTuition sum for 4 year study after 10 years %.2f", tuitionFee);
    }
}
