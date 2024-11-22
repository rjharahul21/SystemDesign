package main.AtmStatus;

import main.*;

public class SelectoperationState implements AtmState{

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
        System.out.println("Select the operation.");
        if(type == Operation.CASHWITHDRAWAL) {
            System.out.println("Enter the amount.");
            atm.setState(new CashwithdrawalState());
        } else if(type == Operation.CHECKBALANCE) {

        } else if(type == Operation.EXIT) {
            ReturnCard(atm);
            Exit(atm);
        }
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
        atm.setState(new IdleState());
    }
    
}
