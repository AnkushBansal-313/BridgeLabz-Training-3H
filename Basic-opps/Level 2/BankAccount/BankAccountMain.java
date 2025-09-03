package BankAccount;
public class BankAccountMain {
    public static void main(String[] args) {
    BankAccount acc1 = new BankAccount("John Doe", "123456789", 5000);
        acc1.displayBalance();
        acc1.deposit(2000);
        acc1.withdraw(1000);
        acc1.displayBalance();
        
    }
}