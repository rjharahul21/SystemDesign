package main.AmountWithdrawal;

import main.Atm;

public class CashWP {
    
    CashWP next;

    public CashWP(CashWP next) {
        this.next = next;
    }

    public void withdraw(Atm atm, int amount) {
        if(next != null) {
            next.withdraw(atm, amount);
        }
    }
}
