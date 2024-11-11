import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TheatreController {
    
    Map<City, List<Theatre>> theatreByCity;
    List<Theatre> allTheatres;

    TheatreController() {
        theatreByCity = new HashMap<>();
        allTheatres = new ArrayList<>();
    }

    public void addTheather(Theatre theatre, City city) {

        allTheatres.add(theatre);

        List<Theatre> list = theatreByCity.getOrDefault(city, new ArrayList<>());
        list.add(theatre);
        theatreByCity.put(city, list);
    }

    public Map<Theatre, List<Show>> getAllShow(Movie userMovie, City userCity) {

        Map<Theatre, List<Show>> showvstheatre = new HashMap<>();

        List<Theatre> theatres = theatreByCity.get(userCity);

        for (Theatre theatre : theatres) {
            List<Show> movieShows = new ArrayList<>();
            List<Show> shows = theatre.getListOfShow();

            for (Show show : shows) {
                if(show.movie.getMovieId() == userMovie.getMovieId()) {
                    movieShows.add(show);
                }
            }
            if(!movieShows.isEmpty()) {
                showvstheatre.put(theatre, movieShows);
            }
        }
        return showvstheatre;
    }
}
