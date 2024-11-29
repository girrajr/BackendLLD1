package introToOOP;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class BankAccount {

    private double balance;
    private String ownerName;
    private final ArrayList<String> transactions = new ArrayList<>();

    // default constructor
    public BankAccount() {
        this.balance = 0;
        this.ownerName = "";
    }

    // parameterized constructor
    public BankAccount(double balance, String ownerName) {
        this.balance = balance;
        this.ownerName = ownerName;
    }

    public double getBalance() {
        return balance;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setBalance(double balance) {
        if( balance>0){
            transactions.add(LocalDateTime.now()+" Set Balance: " + balance + " New balance: " + (this.balance + balance));
            this.balance = balance;
        }

    }
    public void setOwnerName(String ownerName) {
        if( ownerName != null && !ownerName.isEmpty()) {
            this.ownerName = ownerName;
        }
    }

    public void addDeposit(double depositAmount) {
        if ( depositAmount>0) {
            transactions.add(LocalDateTime.now()+" Deposit: " + depositAmount + " New balance: " + (this.balance + depositAmount));
            balance += depositAmount;
        }

    }

    public void withdraw(double withdrawAmount) {
        if( balance >0 && withdrawAmount < balance) {
            transactions.add(LocalDateTime.now()+" Withdrawal: " + withdrawAmount + " New balance: " + (this.balance - withdrawAmount));
            balance -= withdrawAmount;
        }

    }


    public ArrayList<String> getTransactions() {
        return new ArrayList<>(this.transactions);
    }


}
