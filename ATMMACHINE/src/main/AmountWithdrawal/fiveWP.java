package main.AmountWithdrawal;

import main.Atm;

public class fiveWP extends CashWP{
    
    public fiveWP(CashWP next) {
        super(next);
    }

    public void withdraw(Atm atm, int amount) {
        int fivenotes = amount/500;
        int required = amount%500;

        System.out.println("Five hundred notes " + fivenotes);

        if(fivenotes <= atm.getFivenotes()) {
            atm.setFivenotes(atm.getFivenotes() - required);
        } else if(fivenotes > atm.getFivenotes()) {
            required = required + (fivenotes - atm.getFivenotes())*2000;
            atm.setFivenotes(0);
        }

        if(required > 0) {
            super.withdraw(atm, required);
        }
    }
}
