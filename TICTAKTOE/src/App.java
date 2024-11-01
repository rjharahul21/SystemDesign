public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Game game = new Game();
        System.out.println("Winner is " + game.startGame());
    }
}
