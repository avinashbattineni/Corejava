package Inheritance;

public class SavingsAccount extends BankAccount1 {

    public SavingsAccount(int balance) {
        super(balance);
    }

    public int withdraw(int amount) {
        if (balance - amount >= 100) {
            super.withdraw(amount);
        } else {
            System.out.println("Withdrawal denied: Account balance cannot fall below $100.");
        }
        return balance;
    }

    public static void main(String[] args) {
        BankAccount1 account = new BankAccount1(500);
        //System.out.println("Initial Balance: $" + balance);
        System.out.println("Current Balance:" + account.deposit(200));
        System.out.println("Current Balance: $" + account.withdraw(100));

        SavingsAccount savingsAccount = new SavingsAccount(300);
        //System.out.println("\nInitial Balance (Savings Account): $" + account.balance());
        System.out.println("Current Balance (Savings Account): $" + savingsAccount.deposit(150));

    }
}


