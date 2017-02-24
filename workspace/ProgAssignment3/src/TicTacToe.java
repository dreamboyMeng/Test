import java.util.Random;

import org.w3c.dom.css.Counter;

public class TicTacToe {
	
	private Cell[][] board;
	public int counter; // counter represents the number
							// of cells avaiable in the board
	
	public TicTacToe() {
		board = new Cell[5][5];
		counter = 25;
		clearBoard();
	}
	
	public boolean setCell(int xPos, int yPos, Cell mark) {
		if (isEmpty(xPos, yPos) && mark != Cell.EMPTY) {
			board[xPos][yPos] = mark;
			counter--; // This cell is occupied.
			return true;
		} else {
			return false;
		}
	}
	
	public Cell getCell(int xPos, int yPos) {
		return board[xPos][yPos];
	}
	
	public Cell[][] getCell() {
		return board;
	}
	
	public boolean isEmpty(int xPos, int yPos) {
		return getCell(xPos, yPos) == Cell.EMPTY ? true : false;
	}
	
	public void clearBoard() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++){
				board[i][j] = Cell.EMPTY;
			}
		}
	}
	
	public int[] moveByRandom() {
		Random rn = new Random();
		int[] indice = new int[2];
		
		while(true) {
			// first generate two independent random integers in 
			// range 0 to 4
			indice[0] = rn.nextInt(4-0+1);
			indice[1] = rn.nextInt(4-0+1);
			
			if(isEmpty(indice[0], indice[1]))
				return indice;
		}
	}
	
	public boolean gameEnd() {
		if (counter == 0 || checkRows() || checkColumns() || checkDiagonals())
			return true;
		else 
			return false;
	}
	
	public int scoreOfRandom() {
		if (gameEnd() && counter == 0) {
			int score = 1;// calculate Random's score;
			return score;
		} else 
			return 0;
	}
	
	public int scoreOfHuman() {
		if (gameEnd() && counter == 0) {
			int score = 1;// calculate human's score
			return score;
		} else 
			return 0;
	}
	
	//private int calScore(Cell mark) {
		//if (counter != 0) return 0;
		
		//int score = 0;
		// calculate scores from rows
		
		// calculate scores from cols
		// calculate scores from diagonals
		
	//}
	
	public void showBoard() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (board[i][j] == Cell.X)
					System.out.print('X');
				else if (board[i][j] == Cell.O)
					System.out.print('O');
				else 
					System.out.print('-');
			}
			System.out.println();
		}
		System.out.println();
	}
	
	private boolean checkRows() {
		for (int i = 0; i < 5; i++) {
			boolean FiveInARow = true;
			for (int j = 0; j < 5; j++) {
				if (board[i][j] != board[i][0]) {
					FiveInARow = false;
				}
			}
			
			if (FiveInARow && board[i][0] != Cell.EMPTY)
				return true;
		}
		return false;
	}
	
	private boolean checkColumns() {
		for (int j = 0; j < 5; j++) {
			boolean FiveInACol = true;
			for (int i = 0; i < 5; i++) {
				if (board[i][j] != board[0][j]) {
					FiveInACol = false;
				}
			}
			
			if (FiveInACol && board[0][j] != Cell.EMPTY)
				return true;
		}
		return false;
	}
	
	private boolean checkDiagonals() {
		boolean LEFTTORIGHT = true; 
		for (int i = 0; i < 5; i++) {
			if (board[i][i] != board[0][0]) 
				LEFTTORIGHT = false;
		}
		if (LEFTTORIGHT && board[0][0] != Cell.EMPTY)
			return true;
		
		
		boolean RIGHTTOLEFT = true; 
		for (int i = 0; i < 5; i++) {
			if (board[i][4-i] != board[0][4]) 
				RIGHTTOLEFT = false;
		}
		if (RIGHTTOLEFT && board[0][4] != Cell.EMPTY)
			return true;
		
		return false;
		
	}
}