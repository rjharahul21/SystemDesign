import java.util.List;

public class HasMoneyState implements State{

    public HasMoneyState() {
        System.out.println("Machine is in has money state.");
    }

    @Override
    public void putCointButton(VendingMachine machine) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'putCointButton'");
    }

    @Override
    public void putCoin(VendingMachine machine, Coin coin) throws Exception {
        System.out.println("Accept the coin.");
        machine.getCoinList().add(coin);
    }

    @Override
    public void productSelectionButton(VendingMachine machine) throws Exception {
        machine.setVendingMachineState(new SelectionState());
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
        System.out.println("Refunded full money.");
        machine.setVendingMachineState(new SelectionState());
        return machine.getCoinList();
    }
    
}
