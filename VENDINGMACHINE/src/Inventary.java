public class Inventary {
    
    ItemSelf[] itemList;

    public ItemSelf[] getItemList() {
        return itemList;
    }

    public void setItemList(ItemSelf[] itemList) {
        this.itemList = itemList;
    }

    Inventary(int n) {
        itemList = new ItemSelf[n];
        initilizeInventary();
    }

    void initilizeInventary() {
        int scode = 101;
        for(int i = 0; i < 10; i++) {
            ItemSelf itemSelf = new ItemSelf();
            itemSelf.setCode(scode);
            itemSelf.setSoldOut(true);
            itemList[i] = itemSelf;
            scode++;
        }
    }

    Item getitem(int itemCode) throws Exception{
        for (ItemSelf itemSelf : itemList) {
            if(itemSelf.getCode() == itemCode) {
                if(itemSelf.isSoldOut()) {
                    throw new Exception("Iteam sold out.");
                }
                else {
                    return itemSelf.getItem();
                }
            }
        }
        throw new Exception("invalid code.");
    }

    public void updateSoldIteam(int codeNumber){
        for (ItemSelf itemShelf : itemList) {
            if (itemShelf.code == codeNumber) {
                itemShelf.setSoldOut(true);
            }
        }
    }
}
