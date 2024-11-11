import java.util.ArrayList;
import java.util.List;

public class Show {
    
    int showId;
    Movie movie;
    Screen screen;
    int startTime;
    List<Integer> bookedSeat;

    Show() {
        bookedSeat = new ArrayList<>();
    }

    public List<Integer> getBookedSeat() {
        return bookedSeat;
    }
    public void setBookedSeat(List<Integer> bookedSeat) {
        this.bookedSeat = bookedSeat;
    }
}
