import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MovieController {
    
    Map<City, List<Movie>> movieByCity;
    List<Movie> allMovies;

    MovieController() {
        movieByCity = new HashMap<>();
        allMovies = new ArrayList<>();
    }

    public void addMovie(Movie movie, City city) {
        allMovies.add(movie);

        List<Movie> list = movieByCity.getOrDefault(city, new ArrayList<>());
        list.add(movie);
        movieByCity.put(city, list);
    }

    public Movie getMovieByName(String movieName) {
        for (Movie movie : allMovies) {
            if(movie.getMovieName().equals(movieName)){
                return movie;
            }
        }
        return null;
    }
}
