package Strategy;

public class SportDriveStrategy implements DriveStrategy{
    
    @Override
    public void drive() {
        System.out.println("Sport drive mode.");
    }
}
