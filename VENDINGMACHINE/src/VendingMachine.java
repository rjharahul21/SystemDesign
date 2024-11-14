import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    
    private State vendingMachineState;
    public State getVendingMachineState() {
        return vendingMachineState;
    }

    public void setVendingMachineState(State vendingMachineState) {
        this.vendingMachineState = vendingMachineState;
    }

    private Inventary inventary;
    public Inventary getInventary() {
        return inventary;
    }

    public void setInventary(Inventary inventary) {
        this.inventary = inventary;
    }

    private List<Coin> coinList;

    public List<Coin> getCoinList() {
        return coinList;
    }

    public void setCoinList(List<Coin> coinList) {
        this.coinList = coinList;
    }

    VendingMachine() {
        vendingMachineState = new IdleState();
        inventary = new Inventary(10);
        coinList = new ArrayList<>();
    }
}
