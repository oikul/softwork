package domineering;

import java.util.Set;

/**
 * represents the game board in domineering
 * @author mxw596
 */
public class DomineeringBoard extends Board<DomineeringMove>{

	private Player player = Player.MAXIMIZER;
	
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
		return 0;
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
		return "";
	}
}