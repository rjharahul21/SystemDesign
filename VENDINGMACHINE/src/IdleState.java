import java.util.ArrayList;
import java.util.List;

public class IdleState implements State{

    IdleState() {
        System.out.println("Machine is in Idle state.");
    }

    public IdleState(VendingMachine machine) {
        machine.setVendingMachineState(new HasMoneyState());
        machine.setCoinList(new ArrayList<>());
    }

    @Override
    public void putCointButton(VendingMachine machine) throws Exception {
        machine.setVendingMachineState(new HasMoneyState());
    }

    @Override
    public void putCoin(VendingMachine machine, Coin coin) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'putCoin'");
    }

    @Override
    public void productSelectionButton(VendingMachine machine) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'productSelectionButton'");
    }

    @Override
    public void chooseProduct(VendingMachine machine, int productCode) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'chooseProduct'");
    }

    @Override
    public int getChange(int returnChangeMoney) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getChange'");
    }

    @Override
    public Item despenceProduct(VendingMachine machine, int productCode) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'despenceProduct'");
    }

    @Override
    public List<Coin> refund(VendingMachine machine) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'refund'");
    }
    

}
