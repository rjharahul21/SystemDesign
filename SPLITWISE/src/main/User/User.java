package main.User;

import main.Balance.UserBalanceSheet;

public class User {
    String userId;
    String userName;
    UserBalanceSheet balanceSheet;

    public User(String userID, String userName) {
        this.userId = userID;
        this.userName = userName;
        this.balanceSheet = new UserBalanceSheet();
    }

    public String getUserID() {
        return userId;
    }

    public UserBalanceSheet getUserBalanceSheet() {
        return balanceSheet;
    }
}
