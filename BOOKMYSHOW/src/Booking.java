import java.util.List;

public class Booking {
    
    Show show;
    public Show getShow() {
        return show;
    }
    public void setShow(Show show) {
        this.show = show;
    }
    List<Seat> seat;
    public List<Seat> getSeat() {
        return seat;
    }
    public void setSeat(List<Seat> seat) {
        this.seat = seat;
    }
    Payment payment;
}
