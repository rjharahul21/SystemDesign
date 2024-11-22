package main;

public class BankAccount {
    
    int balance;

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public BankAccount(int balance) {
        this.balance = balance;
    }

    public void updateBalance(int amount) {
        balance = balance - amount;
    }
}
