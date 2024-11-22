package main.AmountWithdrawal;

import main.Atm;

public class twokWP extends CashWP{
    
    public twokWP(CashWP next) {
        super(next);
    }

    public void withdraw(Atm atm, int amount) {
        int twoknote = amount/2000;
        int required = amount%2000;
        
        System.out.println("2k notes " + twoknote);

        if(twoknote <= atm.getTwoknotes()) {
            atm.setTwoknotes(atm.getTwoknotes() - required);
        } else if(twoknote > atm.getTwoknotes()) {
            required = required + (twoknote - atm.getTwoknotes())*2000;
            atm.setTwoknotes(0);
        }

        if(required > 0) {
            super.withdraw(atm, required);
        }
    }
}
