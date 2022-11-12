package chapter_X.Exercise_10_07;
import java.util.ArrayList;
import java.util.List;
public class Bank {
    private static final String BANK_NAME = "The Great Bank of Earth";
    private static final String ACCESS_PASSWORD = "!@#$QWERMN90";
    private static List<Account> accountList = new ArrayList<>();
    public static String getBankName(){
        return BANK_NAME;
    }
    public static int getAccountsQuantity(){
        return accountList.size();
    }
    public static boolean checkAccessPassword(String pass){
        return pass.equals(ACCESS_PASSWORD)?true:false;
    }
    public static Account getAccount(int number){
        return accountList.get(number);
    }
    //*********************** HELPER *************************//
    public static void printAccountList(){
        for (int i = 0; i<Bank.getAccountsQuantity(); i++) {
            System.out.printf(Bank.getAccount(i).getName() + " ");
        }
        System.out.println();
    }
    //*********************** ACCOUNT MANAGEMENT *********************//
    public static void addAccount(Account account){
        accountList.add(account);
    }
    public static boolean isActive(int id){
        return getAccount(id).isActive();
    }
    public static void failLogAttemps(Account account){
        account.setFailLogAttempts();
    }
    public static double checkClientAccountBalance(int accountId){
        return accountList.get(accountId).getAccountBalance();
    }
    public static void depositFounds(int id, double founds){
        accountList.get(id).depositFounds(founds);
    }
    public static boolean withdrawFounds(int id, double amount){
        boolean operationAccepted = false;
        if(getAccount(id).getAccountBalance()>=amount){
            accountList.get(id).withdrawFounds(amount);
            System.out.printf("Cash paid of.");
            operationAccepted = true;
        }else {
            System.out.printf("Sorry not enought cash on account.");
            operationAccepted = false;
        }
        return operationAccepted;
    }
    public String printAcountData(Account account){
        String data = "User account name: " + account.getName() + "bla bla bla...\n";
        return data;
    }
    public static int checkId(int i){
        return accountList.get(i).getId();
    }
    public static void createAccounts(){
        for(int i=0;i<10;i++) {
            String name = "A";
            Bank.addAccount(new Account(i, ("A"+i), AccountType.PRIVATE, 1234));
        }
    }
}