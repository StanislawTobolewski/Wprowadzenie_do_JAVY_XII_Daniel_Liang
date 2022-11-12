package chapter_X.Exercise_10_07;
import java.util.Scanner;
public class CashMachine {
    private static String accessPassword = "!@#$QWERMN90";
    private static String getPassword(){
        return accessPassword;
    }
    public void connectToBank() {
        System.out.println("Trying to connect to bank ...\nChecking Cash Machine password...");
        if(Bank.checkAccessPassword(getPassword())){
            System.out.println("Connected to bank established, password correct.");
                caschMachineApp();
        }else {
            System.out.println("Cannot connect to bank, wrong password");
        }
    }
    public void caschMachineApp(){
        char nextOperation = 'y';
        double caschAmount;
        int menuPosition =0;
        int loggedUserId;
        do {
            Account currentUser = clientLoginChecker();
            if (currentUser != null) {
                loggedUserId = currentUser.getId();
                Scanner inScanner = new Scanner(System.in);
                do{
                printCashMachineMenu();
                menuPosition = inScanner.nextInt();
                switch (menuPosition) {
                    case 1:
                        System.out.printf("Your account balance: %.2f $\n", Bank.checkClientAccountBalance(loggedUserId));
                        menuPosition = 0;
                        if(nextOperation()=='n'){
                            logOutInfo();
                        }
                        break;
                    case 2:
                        System.out.printf("Cash amount to withdraw: ");
                        caschAmount = inScanner.nextDouble();
                        Bank.withdrawFounds(loggedUserId, caschAmount);
                        menuPosition = 0;
                        if(nextOperation()=='n'){
                            logOutInfo();
                        }
                        break;
                    case 3:
                        System.out.printf("Cash amount to deposit: ");
                        caschAmount = inScanner.nextDouble();
                        Bank.depositFounds(loggedUserId, caschAmount);
                        System.out.printf("Account balance: %.2f $\n", Bank.getAccount(loggedUserId).getAccountBalance());
                        menuPosition = 0;
                        if(nextOperation()=='n'){
                            logOutInfo();
                        }
                        break;
                    case 4:
                        logOutInfo();
                        nextOperation='n';
                        break;
                    default:
                        System.out.printf("No such option in menu\n");
                        break;
                }
            }while(nextOperation!='n');
        }
        }while(menuPosition!=9);
    }
    private char nextOperation(){
        char nextOperation = ' ';
        Scanner inScanner = new Scanner(System.in);
        System.out.printf("You want proceed next operation ? (y / n): ");
        nextOperation = inScanner.next().charAt(0);
        return nextOperation;
    }
    private void logOutInfo(){
        System.out.printf("You have been logged out. Goodbye.\n\n");
    }
    private Account clientLoginChecker(){
        Account accountFound = null;
        int inId;
        int inPin;
        Scanner inScanner = new Scanner(System.in);
        System.out.printf("Your ID number: ");
        inId = inScanner.nextInt();
        if(idCheck(inId)!=null) {
            System.out.printf("PIN: ");
            inPin = inScanner.nextInt();
            if (pinCheck(inPin)) {
                accountFound = idCheck(inId);
            }else{
                System.out.printf("Wrong pin.\n");
            }
        } else {
            accountFound = null;
        }
        return accountFound;
    }
    private Account idCheck(int id){
        Account account = null;
        for(int i = 0; i<Bank.getAccountsQuantity(); i++){
            if(id==Bank.getAccount(i).getId()){
                account = Bank.getAccount(i);
                break;
            } else {
                account = null;
            }
        }
        return account;
    }
    private boolean pinCheck(int pin){
        boolean isPin = false;
        for(int i = 0; i<Bank.getAccountsQuantity(); i++){
            if(pin==Bank.getAccount(i).getPin()){
                isPin= true;
            }
        }
        return isPin;
    }
    private void printCashMachineMenu(){
        System.out.println("\t\t\tWelcome to " + Bank.getBankName());
        System.out.println("\t\t\t\t\t\tMAIN MENU");
        System.out.println("\t[1] - Account balance\t\t\t\t\t [2] - Withdraw funds");
        System.out.println("\t[3] - deposit funds\t\t\t\t\t\t [4] - Logout");
    }
}