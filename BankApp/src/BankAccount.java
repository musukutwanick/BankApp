public class BankAccount {

    private String accountHolder;
    private double balance;

    public BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Amount must be positive.");
        } else {
            this.balance += amount;
            System.out.println("Deposit of $" + amount + " to account " + this.accountHolder + " successful.");
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Amount must be positive.");
        } else if (amount > this.balance) {
            System.out.println("Insufficient funds. Your balance is $" + this.balance);
        } else {
            this.balance -= amount;
            System.out.println("Withdrawal of $" + amount + " from account " + this.accountHolder + " successful.");
        }
    }

    public void getBalance() {
        System.out.println("Balance of account " + this.accountHolder + " is $" + this.balance);
    }

    public String getAccountHolder() {
        return this.accountHolder;
    }
}
