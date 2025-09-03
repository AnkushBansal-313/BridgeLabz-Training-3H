package JavaConstructer.Level1;

class BankAccount {
    public String accountNumber;
    protected String accountHolder;
    private double balance;

    BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber + ", Account Holder: " + accountHolder + ", Balance: $" + balance);
    }
}

class SavingsAccount extends BankAccount {
    double interestRate;

    SavingsAccount(String accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }

    void displaySavingsDetails() {
        System.out.println("Account Number: " + accountNumber + ", Account Holder: " + accountHolder + ", Balance: $" + getBalance() + ", Interest Rate: " + interestRate + "%");
    }
}

public class BankManagement {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount("ACC101", "Ankush", 5000);
        b1.displayAccountDetails();
        b1.setBalance(5500);
        System.out.println("Updated Balance: $" + b1.getBalance());

        SavingsAccount sa = new SavingsAccount("ACC202", "Rohit", 10000, 4.5);
        sa.displaySavingsDetails();
    }
}
