package main;

import main.AtmStatus.AtmState;
import main.AtmStatus.IdleState;
import main.AtmStatus.Operation;

public class AtmRoom {
    
    static Atm atm;
    static User user;

    public AtmRoom() {
        initilize();
    }

    public void initilize() {
        BankAccount bankAccount = new BankAccount(10000);
        Card card = new Card(1234, bankAccount);
        User user = new User(card, bankAccount);

        Atm atm = new Atm(2,3,4);

        this.user = user;
        this.atm = atm;

        atm.state = new IdleState();
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        AtmRoom atmRoom = new AtmRoom();

        atmRoom.atm.state.InsertCard(atm);
        AtmState state = atm.getState();
        state.AuthanticationPin(atm, user.card, 1234);
        state = atm.getState();
        state.SelectOperation(atm, Operation.CASHWITHDRAWAL);
        state = atm.getState();
        state.CashWithdrawal(atm, user.getUserAcc(), 2700);
        
    }
}
