import java.util.ArrayList;
import java.util.List;

import vechiletype.Vechile;

public class ParkingLot {
    
    private static ParkingLot instance;
    private List<Level> levels;

    private ParkingLot() {
        levels = new ArrayList<>();

        levels.add(new Level(0, 80));
        levels.add(new Level(1, 100));
    }

    public synchronized static ParkingLot getinstance() {
        if(instance == null) {
            instance = new ParkingLot();
        }
        return instance;
    }

    public void parkVechile(Vechile vechile) {
        for(Level level : levels) {
            if(level.parkVechile(vechile)) {
                break;
            }
        }
    }

    public void unparkVechile(Vechile vechile) {
        for(Level level : levels) {
            if(level.unparkVechile(vechile)) {
                break;
            }
        }
    }

    public void showAvalibility() {
        for(Level level : levels) {
            level.showAvalibility();
        }
    }
}
