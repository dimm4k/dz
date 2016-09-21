package dz10_game;

public class Board {
    public static final int BOARD_SIZE = 3;
    private char[][] board;

    Player playerFirst;
    Player playerSecond;
    Player currentPlayer;


    public Board(Player playerFirst, Player playerSecond){
        this.playerFirst = playerFirst;
        this.playerSecond = playerSecond;

        this.currentPlayer = playerFirst;

        board = new char[BOARD_SIZE][BOARD_SIZE];
        fillBoard();
    }



    public boolean makeMove(String move) {
        int i = move.charAt(0);
        int j = move.charAt(1);
        board[i][j] = currentPlayer.getType();

        return true;
    }



    public boolean gameFinished(){
        if (board[0][0] == 'X' && board[0][1] == 'X' && board[0][2] == 'X') {
            return true;
        }
        return false;
    }


    public void fillBoard(){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board [i][j] = ' ';
            }
        }
    }
}
