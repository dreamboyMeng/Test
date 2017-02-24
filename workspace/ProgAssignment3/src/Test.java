import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		int PLAYER = 1; // PLAYER = 1 or 2
		TicTacToe game = new TicTacToe();
		game.clearBoard();
		int indice[] = new int[2];
		
		Scanner in = new Scanner(System.in);
	
		while (true) {
			if (PLAYER == 1) {
				do{
					indice = game.moveByRandom();
				} while (!game.setCell(indice[0], indice[1], Cell.X));
			} else {
				int x, y;
				do {
					x = in.nextInt();
					y = in.nextInt();
				} while (!game.setCell(x, y, Cell.O)); 
			}

			game.showBoard();
			
			if (game.gameEnd()){
				if (game.counter == 0) {
					if(game.scoreOfRandom() > game.scoreOfHuman()) {
						System.out.println("Computer wins");
					} else 
						System.out.println("Human wins");
				} else {
					if (PLAYER == 1)
						System.out.println("Computer wins");
					else 
						System.out.println("Human wins");
				}
				break;
			}
			
			if (PLAYER == 1)
				PLAYER = 2;
			else 
				PLAYER = 1;
		}
	}
}