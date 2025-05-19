package main.Balance;

import java.util.HashMap;
import java.util.Map;

import main.User.User;

public class UserBalanceSheet {
    
    Map<User, Balance> friendExpence;
    double totalMyExpence;
    double totalPayment;
    double totalOwe;
    double totalGetBack;

    public UserBalanceSheet() {
        friendExpence = new HashMap<>();
        totalMyExpence = 0;
        totalOwe = 0;
        totalGetBack = 0;
    }

    public double getTotalMyExpence() {
        return totalMyExpence;
    }
    public void setTotalMyExpence(double totalMyExpence) {
        this.totalMyExpence = totalMyExpence;
    }
    public double getTotalPayment() {
        return totalPayment;
    }
    public void setTotalPayment(double totalPayment) {
        this.totalPayment = totalPayment;
    }
    public double getTotalOwe() {
        return totalOwe;
    }
    public void setTotalOwe(double totalOwe) {
        this.totalOwe = totalOwe;
    }
    public double getTotalGetBack() {
        return totalGetBack;
    }
    public void setTotalGetBack(double totalGetBack) {
        this.totalGetBack = totalGetBack;
    }
}
