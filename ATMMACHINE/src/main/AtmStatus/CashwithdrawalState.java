package main.AtmStatus;

import main.*;
import main.AmountWithdrawal.*;

public class CashwithdrawalState implements AtmState{

    @Override
    public void InsertCard(Atm atm) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'InsertCard'");
    }

    @Override
    public void AuthanticationPin(Atm atm, Card card, int pin) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'AuthanticationPin'");
    }

    @Override
    public void SelectOperation(Atm atm, Operation type) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'SelectOperation'");
    }

    @Override
    public void CashWithdrawal(Atm atm, BankAccount acc, int amount) {
        if(amount > acc.getBalance()) {
            System.out.println("Insufficent balance in account.");
            ReturnCard(atm);
            Exit(atm);
        } else {
            CashWP obj = new twokWP(new fiveWP(new hunWP(null)));
            obj.withdraw(atm, amount);
            acc.updateBalance(amount);
            System.out.println("Collect cash.");
            ReturnCard(atm);
            Exit(atm);
        }
    }

    @Override
    public void Exit(Atm atm) {
        atm.setState(new IdleState());
    }

    @Override
    public void ReturnCard(Atm atm) {
        System.out.println("Take your card.");
        atm.setState(new IdleState());
    }
    
}
