public class Movie{

    int movieId;
    String movieName;
    int duration;

    public int getMovieId() {
        return this.movieId;
    }
    
    public void setMovieId(int id) {
        this.movieId = id;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}