import java.util.concurrent.ThreadLocalRandom;

public class Board {
    
    Cell [][]cells;

    public Board(int size, int snake, int ladder) {
        
        Initilizeboard(size);
        Initilizesnakeladder(snake, ladder);
    }

    void Initilizeboard(int size) {

        cells = new Cell[size][size];

        for(int i = 0; i < size; i++) {
            for(int j = 0; j < size; j++) {
                cells[i][j] = new Cell();
            }
        }
    }

    void Initilizesnakeladder(int snake, int ladder) {
        while(snake > 0) {
            int start = ThreadLocalRandom.current().nextInt(1,cells.length*cells.length - 1);
            int end = ThreadLocalRandom.current().nextInt(1,cells.length*cells.length - 1);
            if(end >= start) {
                continue;
            }

            Jump jump = new Jump();
            jump.start = start;
            jump.end = end;

            Cell cell = getCell(start);
            cell.jump = jump;

            snake--;
        }

        while(ladder > 0) {
            int start = ThreadLocalRandom.current().nextInt(1,cells.length*cells.length - 1);
            int end = ThreadLocalRandom.current().nextInt(1,cells.length*cells.length - 1);
            if( end <= start) {
                continue;
            }

            Jump jump = new Jump();
            jump.start = start;
            jump.end = end;

            Cell cell = getCell(start);
            cell.jump = jump;

            ladder--;
        }
    }

    Cell getCell(int pos) {
        int row = pos/cells.length;
        int col = pos%cells.length;

        return cells[row][col];
    }
}
