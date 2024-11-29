package introToOOP;

public class BankAccount {

    private double balance;
    private String ownerName;

    public double getBalance() {
        return balance;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setBalance(double balance) {
        if( balance>0){
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
            balance += depositAmount;
        }

    }

    public void withdraw(double withdrawAmount) {
        if( balance >0 && withdrawAmount < balance) {
            balance -= withdrawAmount;
        }

    }



}
