import java.io.SyncFailedException;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

import Model.Board;
import Model.PieceO;
import Model.PieceX;
import Model.Player;
import Model.PlayingPiece;

public class Game {
    
    Deque<Player> players;
    Board board;

    Game() {
        initilize();
    }
    
    public void initilize() {

        players = new LinkedList<>();

        PlayingPiece playingPiece1 = new PieceO();
        Player player1 = new Player("Ram", playingPiece1);

        PlayingPiece playingPiece2 = new PieceX();
        Player player2 = new Player("Shayam", playingPiece2);

        players.add(player1);
        players.add(player2);

        board = new Board(3);
    }

    public String startGame() {

        boolean winner = false;
        while(!winner){
            board.printBoard();
            boolean isFilled = board.isFilled();
            if(isFilled) {
                System.out.println("Match draw.");
                return "no one.";
            }

            Player turn = players.removeFirst();

            Scanner obj = new Scanner(System.in);
            System.out.println("Enter row, coloum.");
            String input = obj.nextLine();
            String[] str = input.split(",");
            Integer inputRow = Integer.valueOf(str[0]);
            Integer inputColoum = Integer.valueOf(str[1]);

            boolean addPiece = board.addPiece(inputRow, inputColoum, turn.piece);
            if(!addPiece) {
                System.out.println("Enter empty space try again.");
                players.addFirst(turn);
                continue;
            }
            
            boolean rowMatch = true;
            boolean columnMatch = true;
            boolean diagonalMatch = true;
            boolean antiDiagonalMatch = true;

            for(int i = 0; i < 3; i++) {
                if(board.board[inputRow][i] == null || board.board[inputRow][i].type != turn.piece.type) rowMatch = false;
            }
            for(int i = 0; i < 3; i++) {
                if(board.board[i][inputColoum] == null || board.board[i][inputColoum].type != turn.piece.type) columnMatch = false;
            }
            for(int i = 0,j = 0; i < 3; i++, j++) {
                if(board.board[i][j] == null || board.board[i][j].type != turn.piece.type) diagonalMatch = false;
            }
            for(int i = 2,j = 0; i >= 0; i--, j++) {
                if(board.board[i][j] == null || board.board[i][j].type != turn.piece.type) antiDiagonalMatch = false;
            }
            if(rowMatch || columnMatch || diagonalMatch || antiDiagonalMatch) return turn.name;

            players.addLast(turn);
        }
        return "tie";
    }
}
