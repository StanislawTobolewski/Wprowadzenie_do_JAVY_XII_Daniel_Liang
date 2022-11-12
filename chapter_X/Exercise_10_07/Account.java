package chapter_X.Exercise_10_07;

public class Account {
    private int id;
    private int pin;
    private boolean isActive = true;
    private byte failLogAttempts = 3;
    private AccountType accountType;
    private static int idCounter = 0;
    private String name;
    private double accountBalance = 100.00;
    public Account(int id,String name, AccountType accountType, int pin) {
        this.id = id;
        this.name = name;
        this.accountType = accountType;
        this.pin = 1234;
        //this.pin = generatePin();
        idCounter++;
    }
    public Account(){};
    public String getName(){
        return name;
    }
    public boolean isActive(){
        return isActive;
    }
    public void setFailLogAttempts(){
        if(failLogAttempts>0)
        {
        failLogAttempts--;
        }else {
            isActive=false;
        }
    }
    public int getId(){
        return this.id;
    }
    public int getPin(){
        return pin;
    }
    public double getAccountBalance(){
        return this.accountBalance;
    }
    public void depositFounds(double founds){
        accountBalance+=founds;
    }
    public void withdrawFounds(double amount){
        accountBalance-=amount;
    }
    private int generatePin(){
        int pin = 0;
        do {
            pin = (int) (Math.random() * 10000);
        }while(pin<1000);
        return pin;
    }
}