import java.util.List;

public interface State {
    
    public void putCointButton(VendingMachine machine) throws Exception;

    public void putCoin(VendingMachine machine, Coin coin) throws Exception;

    public void productSelectionButton(VendingMachine machine) throws Exception;

    public void chooseProduct(VendingMachine machine, int productCode) throws Exception;

    public int getChange(int returnChangeMoney) throws Exception;

    public Item despenceProduct(VendingMachine machine, int productCode) throws Exception;

    public List<Coin> refund(VendingMachine machine) throws Exception;
}
