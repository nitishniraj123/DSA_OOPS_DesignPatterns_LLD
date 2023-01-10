package LLD.SnakeLadderGame;

public class Board {
    Cell[][] cells;

    Board(int boardSize,int noOfSnakes,int noOfLadders) {
        initializeCells(boardSize);
        addSnakes(noOfSnakes);
        addLadders(noOfLadders);
    }

    private void initializeCells(int boardSize){

    }

    private void addSnakes(int noOfSnakes){

    }

    private void addLadders(int noOfLadders){

    }

    Cell getCell(int playerPosition){
        int boardRow = playerPosition/cells.length;
        int boardColumn = playerPosition % cells.length;
        return cells[boardRow][boardColumn];
    }
}
