package main.AtmStatus;

import main.Card;

import main.Atm;
import main.BankAccount;

public class IdleState implements AtmState{

    public IdleState() {
        System.out.println("Insert your card.");
    }

    @Override
    public void InsertCard(Atm atm) {
        System.out.println("Card is inserted.");
        atm.setState(new HascardState());
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
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'CashWithdrawal'");
    }

    @Override
    public void Exit(Atm atm) {
        ReturnCard(atm);
        atm.setState(new IdleState());
    }

    @Override
    public void ReturnCard(Atm atm) {
        System.out.println("Take your card.");
    }
    
}
