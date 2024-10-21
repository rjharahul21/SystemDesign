import Strategy.DriveStrategy;

public class Vechile {
    
    DriveStrategy obj;

    Vechile(DriveStrategy ob) {
        this.obj = ob;
    }

    public void drive() {
        obj.drive();
    }
}
