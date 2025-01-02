package Inheritance;

public class BankAccount1 {
    int balance;
    public BankAccount1(int balance)
    {
        this.balance=balance;
    }

    public int deposit(int amount)
    {
        balance=balance+amount;
        System.out.println("Deposited: $" + amount);
        return balance;
    }
    public int withdraw(int amount)
    {
       if(amount>0 && amount<=balance)
       {
           balance=balance-amount;
           System.out.println("Withdrawn: $" + amount);

       }
        return balance;

    }
}
