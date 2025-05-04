import java.util.*;

import vechiletype.Vechile;
import vechiletype.VechileType;

public class Level {
    
    private int floor;
    private List<ParkingSpot> parkingSpot;

    public Level(int floor, int numberOfSpot) {
        this.floor = floor;
        parkingSpot = new ArrayList<>();

        int eachSpot = numberOfSpot/3;
        for(int i = 0; i < eachSpot; i++) {
            parkingSpot.add(new ParkingSpot(i, VechileType.BIKE));
        }

        for(int i = eachSpot; i < 2 * eachSpot; i++) {
            parkingSpot.add(new ParkingSpot(i, VechileType.CAR));
        }

        for(int i = 2 * eachSpot; i < numberOfSpot; i++) {
            parkingSpot.add(new ParkingSpot(i, VechileType.TRUCK));
        }
    }

    public synchronized boolean parkVechile(Vechile vechile) {
        for(ParkingSpot spot : parkingSpot) {
            if(spot.getVechileType() == vechile.getVechileType() && spot.isAvailable()) {
                return spot.parkVechile(vechile);
            }
        }
        System.out.println("Spot for this vechile is not avaliable.");
        return false;
    }

    public synchronized boolean unparkVechile(Vechile vechile) {
        for(ParkingSpot spot : parkingSpot) {
            if(!spot.isAvailable() && spot.getVechile().equals(vechile)) {
                spot.unparkVechile();
                System.out.println("vechile unparked.");
                return true;
            }
        }
        return false;
    }

    public void showAvalibility() {
        for(ParkingSpot spot : parkingSpot) {
            if(spot.isAvailable()) {
                System.out.println("Level " + this.floor + " spot " + spot.getSpotNumber() + " is available.");
            }
        }
    }
}
