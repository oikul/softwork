package domineering;

/**
 * allows a user to play domineering on the command line
 * @author mxw596
 */
public class CommandLineDomineering {
	
	/**
	 * a private inner class that handles the moves the player can make
	 * @author mxw596
	 */
	private static class Domineer implements MoveChannel<DomineeringMove>{

		@Override
		public void end(int value) {
			comment("The game is over, the result is: " + value);
		}

		@Override
		public void comment(String msg) {
			System.out.println(msg);
		}

		@Override
		public DomineeringMove getMove() {
			return DomineeringMove.valueOf(System.console().readLine("Enter your move: "));
		}

		@Override
		public void giveMove(DomineeringMove move) {
			comment("I play " + move);
		}
		
	}
	
	public static void main(String args[]) {
		DomineeringBoard board = new DomineeringBoard();
		System.out.println(board);
	}
}