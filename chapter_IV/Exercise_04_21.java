package chapter_IV;

public class Exercise_04_21 {
    public static void main(String[] args) {
        String  idNumber = "";
        String idNumber1 = "YBT160586";
        String idNumber2 = "BD080586";
        idNumber = idNumber1;

        checkIdValid(idNumber);
    }
    public static void showResult(boolean valid){
        String output = "";
        output = (valid) ? "Number is valid": "Number is not valid.";
        System.out.printf(output);
    }
    public static void checkIdValid(String idNumber){
        boolean valid = false;
        if(idNumber.length()==9) {
            for (int i = 0; i < 3; i++) {
                if (((byte) idNumber.charAt(i) >= 65) && ((byte) idNumber.charAt(i) <= 90)) {
                    valid = true;
                } else {
                    valid = false;
                    break;
                }
            }
            if(valid) {
                for (int i = 3; i < 9; i++) {
                    if (((byte) idNumber.charAt(i) >= 48) && ((byte) idNumber.charAt(i) <= 57)) {
                        valid = true;
                    } else {
                        valid = false;
                        break;
                    }
                }
            }
            showResult(valid);
        }else {
            System.out.printf("Number is not valid.");
        }
    }
}
