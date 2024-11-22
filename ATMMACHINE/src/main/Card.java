package main;

public class Card {

    int pin;
    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    BankAccount account;

    public Card(int pin, BankAccount account) {
        this.pin = pin;
        this.account = account;
    }
}
