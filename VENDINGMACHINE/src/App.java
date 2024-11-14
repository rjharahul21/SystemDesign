public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        VendingMachine machine = new VendingMachine();
        try {

            System.out.println("|");
            System.out.println("Fillinf inventery.");
            System.out.println("|");

            fillingInventary(machine);
            displayinventery(machine);

            System.out.println("|");
            System.out.println("clicking on InsertCoinButton");
            System.out.println("|");

            State state = machine.getVendingMachineState();
            state.putCointButton(machine);
            System.out.println("after putCointButton");

            state = machine.getVendingMachineState();
            state.putCoin(machine, Coin.TENR);
            state.putCoin(machine, Coin.FIVER);

            System.out.println("|");
            System.out.println("clicking on ProductSelectionButton");
            System.out.println("|");
            state.productSelectionButton(machine);

            state = machine.getVendingMachineState();
            state.chooseProduct(machine, 102);

            displayinventery(machine);
        }
        catch(Exception e) {
            displayinventery(machine);
        }
    }

    static void fillingInventary(VendingMachine machine) {
        ItemSelf[] itemSelf = machine.getInventary().getItemList();
        for(int i = 0; i < itemSelf.length; i++) {
            Item item = new Item();
            if(i>=0 && i<=2) {
                item.setType(ItemType.COKE);
                item.setPrice(12);
            }
            if(i>=3&&i<=5) {
                item.setType(ItemType.PEPSI);
                item.setPrice(10);
            }
            if(i>=6&&i<=8) {
                item.setType(ItemType.JUICE);
                item.setPrice(14);
            }
            if(i>=9&&i<10) {
                item.setType(ItemType.SODA);
                item.setPrice(9);
            }
            itemSelf[i].setItem(item);
            itemSelf[i].setSoldOut(false);
        }
    }

    private static void displayinventery(VendingMachine vendingMachine){

        ItemSelf[] slots = vendingMachine.getInventary().getItemList();
        for (int i = 0; i < slots.length; i++) {

            System.out.println("CodeNumber: " + slots[i].getCode() +
                    " Item: " + slots[i].getItem().getType().name() +
                    " Price: " + slots[i].getItem().getPrice() +
                    " isAvailable: " + !slots[i].isSoldOut());
        }
    }
}
