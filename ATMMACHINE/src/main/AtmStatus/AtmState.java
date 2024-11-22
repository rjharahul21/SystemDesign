package main.AtmStatus;
import main.*;

public interface AtmState {
    
    public void InsertCard(Atm atm);

    public void AuthanticationPin(Atm atm, Card card, int pin);

    public void SelectOperation(Atm atm, Operation type);

    public void CashWithdrawal(Atm atm, BankAccount acc, int amount);

    public void Exit(Atm atm);

    public void ReturnCard(Atm atm);
}
