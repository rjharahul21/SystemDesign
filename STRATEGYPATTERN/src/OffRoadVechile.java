import Strategy.SportDriveStrategy;

public class OffRoadVechile extends Vechile{
    
    OffRoadVechile() {
        super(new SportDriveStrategy());
    }
}
