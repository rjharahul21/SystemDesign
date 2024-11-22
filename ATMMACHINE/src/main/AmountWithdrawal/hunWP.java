package main.AmountWithdrawal;

import main.Atm;

public class hunWP extends CashWP{
    
    public hunWP(CashWP next) {
        super(next);
    }

    public void withdraw(Atm atm, int amount) {
        int hunnotes = amount/100;
        int required = amount%100;

        System.out.println("Humdred notes " + hunnotes);

        if(hunnotes <= atm.getHunnotes()) {
            atm.setHunnotes(atm.getHunnotes() - required);
        } else if(hunnotes > atm.getHunnotes()) {
            required = required + (hunnotes - atm.getHunnotes())*2000;
            atm.setHunnotes(0);
        }

        if(required > 0) {
            super.withdraw(atm, required);
        }
    }
}
