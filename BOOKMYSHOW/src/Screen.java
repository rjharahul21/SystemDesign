import java.util.List;

public class Screen {
    
    int screenId;
    List<Seat> listOfSeat;
    public List<Seat> getListOfSeat() {
        return listOfSeat;
    }
    public void setListOfSeat(List<Seat> listOfSeat) {
        this.listOfSeat = listOfSeat;
    }
}
