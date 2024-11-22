package main;

public class User {

    Card card;
    BankAccount userAcc;

    public BankAccount getUserAcc() {
        return userAcc;
    }

    public void setUserAcc(BankAccount userAcc) {
        this.userAcc = userAcc;
    }

    public User(Card card, BankAccount userAcc) {
        this.card = card;
        this.userAcc = userAcc;
    }
}
