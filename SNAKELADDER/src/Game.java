import java.util.Deque;
import java.util.LinkedList;

public class Game {
    
    Board board;
    Dice dice;
    Deque<Player> players = new LinkedList<>();
    Player winner;

    public Game() {
        Initilize();
    }

    void Initilize() {
        board = new Board(10,5,5);
        dice = new Dice(1);
        winner = null;
        addPlayer();
    }

    void addPlayer() {
        Player player = new Player("P1", 0);
        players.add(player);
        player = new Player("P2", 0);
        players.add(player);
    }

    public void startGame() {
        while (winner == null) {
            Player turn = players.removeFirst();
            players.addLast(turn);
            System.out.println("Player turn is " + turn.id + " current pos is " + turn.currPosition);

            int diceNumber = dice.rollDice();

            int newPos = turn.currPosition + diceNumber;
            newPos = jumpCheck(newPos);
            turn.currPosition = newPos;

            System.out.println("Player turn is " + turn.id + " new pos is " + turn.currPosition);

            if(newPos >= board.cells.length*board.cells.length - 1) {
                winner = turn;
            }
        }
        System.out.println("Winner is " + winner.id);
    }

    int jumpCheck(int newPos) {
        if(newPos >= board.cells.length*board.cells.length - 1) {
            return newPos;
        }

        Cell cell = board.getCell(newPos);
        if(cell.jump != null && cell.jump.start == newPos) {
            String jumpBy = cell.jump.start > cell.jump.end ? "Snake" : "Ladder";
            System.out.println("Jump by " + jumpBy);
            return cell.jump.end;
        }

        return newPos;
    }
}
