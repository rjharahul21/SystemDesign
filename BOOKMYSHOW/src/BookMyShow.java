import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class BookMyShow {
    
    MovieController movieController;
    TheatreController theatreController;

    BookMyShow() {
        movieController = new MovieController();
        theatreController = new TheatreController();
    }

    public void createBooking(City userCity, String movieName) {

        List<Movie> movies = movieController.allMovies;
        Movie intrestedMovie = null;
        for (Movie movie : movies) {
            if(movie.getMovieName().equals(movieName)) {
                intrestedMovie = movie;
            }
        }

        Map<Theatre, List<Show>> showsTheatherwise = theatreController.getAllShow(intrestedMovie, userCity);
        Map.Entry<Theatre, List<Show>> entry = showsTheatherwise.entrySet().iterator().next();
        List<Show> runningShows = entry.getValue();
        Show intrestedShow = runningShows.get(0);

        int seatNumber = 30;
        List<Integer> bookedSeats = intrestedShow.getBookedSeat();
        if(!bookedSeats.contains(seatNumber)) {
            bookedSeats.add(seatNumber);

            Booking booking = new Booking();
            List<Seat> myBookedSeat = new ArrayList<>();
            for (Seat screenSeat : intrestedShow.screen.getListOfSeat()) {
                if(screenSeat.seatId == seatNumber) {
                    myBookedSeat.add(screenSeat);
                }
            }
            booking.setSeat(myBookedSeat);
            booking.setShow(intrestedShow);
        }
        else {
            System.out.println("Seat allreday booked, try again.");
            return;
        }
        System.out.println("Seat Booked.");
    }

    public void Initilize() {
        createMovie();
        createTheatre();
    }

    void createTheatre() {
        
        Movie avenger = movieController.getMovieByName("AVENGER");
        Movie bahubali = movieController.getMovieByName("BAHUBALI");

        Theatre inoxTheatre = new Theatre();
        inoxTheatre.theatreId = 1;
        inoxTheatre.city = City.Banglore;
        inoxTheatre.setListOfScreen(createScreen());
        List<Show> inoxShow = new ArrayList<>();
        Show inoxMorningShow = createShow(1,inoxTheatre.getListOfScreen().get(0),avenger,10);
        Show inoxEveningShow = createShow(2,inoxTheatre.getListOfScreen().get(0),bahubali,16);
        inoxShow.add(inoxMorningShow);
        inoxShow.add(inoxEveningShow);
        inoxTheatre.setListOfShow(inoxShow);

        Theatre pvrTheatre = new Theatre();
        pvrTheatre.theatreId = 2;
        pvrTheatre.city = City.Delhi;
        pvrTheatre.setListOfScreen(createScreen());
        List<Show> pvrShow = new ArrayList<>();
        Show pvrMorningShow = createShow(1,pvrTheatre.getListOfScreen().get(0),avenger,11);
        Show pvrEveningShow = createShow(2,pvrTheatre.getListOfScreen().get(0),bahubali,17);
        pvrShow.add(pvrMorningShow);
        pvrShow.add(pvrEveningShow);
        pvrTheatre.setListOfShow(pvrShow);

        theatreController.addTheather(inoxTheatre, City.Banglore);
        theatreController.addTheather(pvrTheatre, City.Delhi);
    }

    Show createShow(int showId, Screen screen, Movie movie, int startTime) {
        Show show = new Show();
        show.showId = showId;
        show.screen = screen;
        show.movie = movie;
        show.startTime = startTime;
        return show;
    }

    List<Screen> createScreen() {

        List<Screen> screenList = new ArrayList<>();
        Screen screen1 = new Screen();
        screen1.screenId = 1;
        screen1.setListOfSeat(createSeats());
        screenList.add(screen1);
        return screenList;
    }

    List<Seat> createSeats() {
        
        List<Seat> seatList = new ArrayList<>();

        for(int i = 0; i < 30; i++) {
            Seat seat = new Seat();
            seat.seatId = i;
            seat.seatCatogary = SeatCatogary.GOLD;
            seatList.add(seat);
        }

        for(int i = 30; i < 60; i++) {
            Seat seat = new Seat();
            seat.seatId = i;
            seat.seatCatogary = SeatCatogary.SILVER;
            seatList.add(seat);
        }

        for(int i = 60; i < 90; i++) {
            Seat seat = new Seat();
            seat.seatId = i;
            seat.seatCatogary = SeatCatogary.PLATINUM;
            seatList.add(seat);
        }

        return seatList;
    }

    void createMovie() {

        Movie avenger = new Movie();
        avenger.movieId = 1;
        avenger.movieName = "AVENGER";
        avenger.duration = 128;

        Movie bahubali = new Movie();
        bahubali.movieId = 2;
        bahubali.movieName = "BAHUBALI";
        bahubali.duration = 150;

        movieController.addMovie(avenger, City.Banglore);
        movieController.addMovie(bahubali, City.Delhi);
    }
}
