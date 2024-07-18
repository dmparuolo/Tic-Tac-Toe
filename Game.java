

public class Game {
	
	private String [][] board = {{"-","-","-"},{"-","-","-"},{"-","-","-"}};
	private int row, collumn, tooty;
	private String turn;
	private String winner;
	
	
	
	public Game() {
		row = 0;
		collumn = 0;
		winner = "";
		turn = "X";
		tooty = 1;
	}
	
	public void change(int rx, int cx) {
		row = rx; collumn = cx;
		board[row-1][collumn-1] = turn;
		if(turn.equals("X")) {turn = "O";} else {turn = "X";}
		if(gameEnd()) {
			if(winner.equals("X")) {tooty=1;}else if(winner.equals("O")) {tooty=2;}else {tooty=3;}
			reset f = new reset();
			f.twist(tooty);
		}
	}
	
	public boolean gameEnd() {
		for(int r = 0; r < 3; r++) {
			if(board[r][0].equals(board[r][1]) && board[r][0].equals(board[r][2]) && !(board[r][0].equals("-")) && !(board[r][1].equals("-")) && !(board[r][2].equals("-"))){
				winner = board[r][0];
				return true;
			}
			if(board[0][r].equals(board[1][r]) && board[0][r].equals(board[2][r]) && !(board[0][r].equals("-")) && !(board[1][r].equals("-")) && !(board[2][r].equals("-"))){
				winner = board[0][r];
				return true;
			}
		}
		if(board[0][0].equals(board[1][1]) && board[0][0].equals(board[2][2]) && !(board[0][0].equals("-")) && !(board[1][1].equals("-")) && !(board[2][2].equals("-"))) {winner = board[0][0]; return true;}
		if(board[0][2].equals(board[1][1]) && board[0][2].equals(board[2][0]) && !(board[0][2].equals("-")) && !(board[1][1].equals("-")) && !(board[2][0].equals("-"))) {winner = board[0][2]; return true;}
		for(int r = 0; r < 3; r++) {
			for(int c = 0; c < 3; c++) {
				if(board[r][c].equals("-")) {
					return false;
				}
			}
		}
		winner = "draw";
		return true;
	}
	

}
