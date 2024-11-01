package Model;

public class Board {
    
    public int size;
    public PlayingPiece [][]board;
    public Board(int size) {
        this.size = size;
        board = new PlayingPiece[size][size];
    }

    public void printBoard() {
        for(int i = 0;i < size; i++) {
            for(int j = 0; j < size; j++) {
                if(board[i][j] != null) {
                    System.out.print(board[i][j].type.name() + "   ");
                }else {
                    System.out.print("    ");
                }
                System.out.print("|");
            }
            System.out.println();
        }
    }

    public boolean isFilled() {
        for(int i = 0; i < size; i++) {
            for(int j = 0; j < size; j++) {
                if(board[i][j] == null)
                    return false;
            }
        }
        return true;
    }

    public boolean addPiece(int a, int b, PlayingPiece piece) {
        if(board[a][b] != null) return false;

        board[a][b] = piece;
        return true;
    }
}
