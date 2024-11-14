import java.util.List;

public class SelectionState implements State{

    public SelectionState() {
        System.out.println("Machine is now in selections state.");
    }

    @Override
    public void putCointButton(VendingMachine machine) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'putCointButton'");
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
        Item item = machine.getInventary().getitem(productCode);

        int userCoin = 0;
        for (Coin coin : machine.getCoinList()) {
            userCoin += coin.value;
        }

        if(userCoin < item.getPrice()) {
            System.out.println("Insufficent amount.");
            refund(machine);
            throw new Exception("Insufficent Amount.");
        }
        else {
            if(userCoin > item.getPrice()) {
                getChange(userCoin - item.getPrice());
            }
            machine.setVendingMachineState(new DispenceState(machine, productCode));
        }
    }

    @Override
    public int getChange(int returnChangeMoney) throws Exception {
        System.out.println("Change refunded.");
        return returnChangeMoney;
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
