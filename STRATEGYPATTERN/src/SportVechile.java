import Strategy.SportDriveStrategy;

public class SportVechile extends Vechile{
    
    SportVechile() {
        super(new SportDriveStrategy());
    }
}
