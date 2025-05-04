import vechiletype.Vechile;
import vechiletype.VechileType;

public class ParkingSpot {
    
    private int spotNumber;
    private VechileType type;
    private Vechile parkedVechile;

    public ParkingSpot(int spotNumber, VechileType vechileType) {
        this.spotNumber = spotNumber;
        this.type = vechileType;
        this.parkedVechile = null;
    }

    public VechileType getVechileType() {
        return this.type;
    }

    public synchronized boolean isAvailable() {
        return this.parkedVechile == null;
    }

    public Vechile getVechile() {
        return this.parkedVechile;
    }

    public int getSpotNumber() {
        return this.spotNumber;
    }

    public synchronized boolean parkVechile(Vechile vechile) {
        if(vechile.getVechileType() == this.type) {
            parkedVechile = vechile;
            System.out.println("Vechile parked at " + this.spotNumber);
            return true;
        } else {
            System.out.println("Vechile type is diffrent.");
        }
        return false;
    }

    public synchronized boolean unparkVechile() {
        this.parkedVechile = null;
        return true;
    }
}
