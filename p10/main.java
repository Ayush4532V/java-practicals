
class BankAccount {
    private String accountHolder;
    private int accountNumber;
    private double balance;

    // Constructor
    BankAccount(String holder, int number, double balance) {
        this.accountHolder = holder;
        this.accountNumber = number;
        this.balance = balance;
    }

    // Getters
    public String getAccountHolder() {
        return accountHolder;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    // Deposit money
    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid deposit amount!");
        } else {
            balance += amount;
            System.out.println("Deposit successful.");
        }
    }

    // Withdraw money
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount!");
        } else if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful.");
        }
    }
}

public class Main {
    public static void main(String[] args) {

        BankAccount acc = new BankAccount("Ayush", 101, 5000);

        System.out.println("Account Holder: " + acc.getAccountHolder());
        System.out.println("Account Number: " + acc.getAccountNumber());
        System.out.println("Initial Balance: " + acc.getBalance());

        acc.deposit(2000);
        acc.deposit(-500);

        acc.withdraw(1000);
        acc.withdraw(0);
        acc.withdraw(10000);

        System.out.println("Updated Balance: " + acc.getBalance());
    }
}

