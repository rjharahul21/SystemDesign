import Strategy.NormalDriveStrategy;

public class GoodsVechile extends Vechile{
    
    GoodsVechile() {
        super(new NormalDriveStrategy());
    }
}
