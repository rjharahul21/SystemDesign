import java.util.List;

public class DispenceState implements State{

    public DispenceState(VendingMachine machine, int productCode) throws Exception{
        System.out.println("machine is in Dispence state.");
        despenceProduct(machine, productCode);
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
        System.out.println("Product is despence.");
        Item item = machine.getInventary().getitem(productCode);
        machine.getInventary().updateSoldIteam(productCode);
        machine.setVendingMachineState(new IdleState(machine));
        return item;
    }

    @Override
    public List<Coin> refund(VendingMachine machine) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'refund'");
    }
    
}
