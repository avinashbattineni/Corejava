package javapractice;

public class BankAccount {
    private int accountNumber=12345667;
    private int balance=12345;

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
public void diaplay()
{
    System.out.println("account number is: "+accountNumber);

    System.out.println("account balance is: "+balance);
}

    public static void main(String[] args) {
        BankAccount b=new BankAccount();
        b.setAccountNumber(12345);
        b.setBalance(2000);
        b.diaplay();

    }
}
