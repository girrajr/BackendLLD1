package introToOOP;

public class BankAccount {

    double balance;
    String ownerName;

    public void addDeposit(double depositAmount) {
        if ( depositAmount<0) {
            System.out.println("Invalid deposit amount");
            return;
        }
        balance += depositAmount;
    }

    public void withdraw(double withdrawAmount) {
        if(withdrawAmount > balance) {
            System.out.println("Insufficient funds");
            return;
        }
        balance -= withdrawAmount;
    }



}
