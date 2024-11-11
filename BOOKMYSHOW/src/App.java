public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        BookMyShow bookMyShow = new BookMyShow();
        bookMyShow.Initilize();

        bookMyShow.createBooking(City.Banglore, "AVENGER");
        bookMyShow.createBooking(City.Delhi, "BAHUBALI");
    }
}
