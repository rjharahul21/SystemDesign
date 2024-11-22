package main.AtmStatus;

import main.*;

public class HascardState implements AtmState{

    @Override
    public void InsertCard(Atm atm) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'InsertCard'");
    }

    @Override
    public void AuthanticationPin(Atm atm, Card card, int pin) {
        if(card.getPin() == pin) {
            atm.setState(new SelectoperationState());
        } else {
            System.out.println("Pin is incorrect.");
            ReturnCard(atm);
            Exit(atm);
        }
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
        atm.setState(new IdleState());
    }

    @Override
    public void ReturnCard(Atm atm) {
        System.out.println("Take your card.");
    }
    
}
