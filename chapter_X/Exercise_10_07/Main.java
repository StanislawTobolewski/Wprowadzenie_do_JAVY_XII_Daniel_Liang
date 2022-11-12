package chapter_X.Exercise_10_07;

public class Main {
    public static void main(String[] args) {

        Bank.createAccounts();

        CashMachine cashMashine1 = new CashMachine();
        cashMashine1.connectToBank();

    }
}
