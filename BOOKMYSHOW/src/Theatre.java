import java.util.List;

public class Theatre {
    
    int theatreId;
    City city;
    List<Screen> listOfScreen;
    List<Show> listOfShow;
    public List<Show> getListOfShow() {
        return listOfShow;
    }
    public void setListOfShow(List<Show> listOfShow) {
        this.listOfShow = listOfShow;
    }
    public List<Screen> getListOfScreen() {
        return listOfScreen;
    }
    public void setListOfScreen(List<Screen> listOfScreen) {
        this.listOfScreen = listOfScreen;
    }
}
