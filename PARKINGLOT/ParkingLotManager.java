import vechiletype.Bike;
import vechiletype.Car;
import vechiletype.Truck;
import vechiletype.Vechile;

public class ParkingLotManager {
    
    public static void main(String[] args) {

        ParkingLot parkingLot = ParkingLot.getinstance();

        Vechile bike1 = new Bike("bike1");
        Vechile car1 = new Car("car2");
        Vechile truck1 = new Truck("truck1");

        parkingLot.parkVechile(bike1);
        parkingLot.parkVechile(car1);
        parkingLot.parkVechile(truck1);
        
        parkingLot.unparkVechile(bike1);
        parkingLot.unparkVechile(car1);
        parkingLot.unparkVechile(truck1);

        parkingLot.showAvalibility();
    }
}
