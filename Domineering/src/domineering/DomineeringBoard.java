package domineering;

import java.util.Set;

/**
 * represents the game board in domineering
 * @author mxw596
 */
public class DomineeringBoard extends Board<DomineeringMove>{

	private Player player = Player.MAXIMIZER;
	private boolean[][] board;
	
	/**
	 * this constructor creates a new 4x4 board in domineering
	 */
	public DomineeringBoard() {
		constructBoard(4, 4);
	}
	
	/**
	 * this constructor creates a new domineering board with width m and height n
	 * @param m the width of the board
	 * @param n the height of the board
	 */
	public DomineeringBoard(int m, int n){
		constructBoard(m, n);
	}
	
	/**
	 * constructs the board
	 * @param m the width of the board
	 * @param n the height of the board
	 */
	public void constructBoard(int m, int n){
		setBoard(new boolean[m][n]);
	}

	@Override
	Player nextPlayer() {
		if(player == Player.MAXIMIZER){
			return Player.MINIMIZER;
		}
		return Player.MAXIMIZER;
	}

	@Override
	int value() {
		return (player == Player.MAXIMIZER) ? -1 : 1;
	}

	@Override
	Board<DomineeringMove> play(DomineeringMove move) {
		return null;
	}

	@Override
	Set<DomineeringMove> availableMoves() {
		return null;
	}
	
	/**
	 * generates a string representation of the game board
	 */
	public String toString(){
		StringBuilder b = new StringBuilder();
		for(int i = 0; i < board.length; i++){
			for(int j = 0; j < board[0].length; j++){
				if(board[i][j]){
					b.append(" [ y ] ");
				}else{
					b.append(" [ n ] ");
				}
			}
			b.append("\n");
		}
		return b.toString();
	}

	public boolean[][] getBoard() {
		return board;
	}

	public void setBoard(boolean[][] board) {
		this.board = board;
	}
}