package domineering;

/**
 * a class representing a move in domineering
 * 
 * @author mxw596
 */
public class DomineeringMove {

	private final int xCoord, yCoord; // the coords of where the move starts
	private final boolean orientation; // true is vertical, false is horizontal

	/**
	 * creates a domineering move
	 * 
	 * @param x
	 *            the x coordinate of the move
	 * @param y
	 *            the y coordinate of the move
	 * @param orient
	 *            the orientation of the move, true is vertical, false is
	 *            horizontal
	 */
	public DomineeringMove(int x, int y, boolean orient) {
		xCoord = x;
		yCoord = y;
		orientation = orient;
	}

	/**
	 * gets the value of a string and represents it as a DomineeringMove
	 * 
	 * @param s
	 *            the string that is to be converted to a move
	 * @return a DomineeringMove based on the input string
	 */
	public static DomineeringMove valueOf(String s) {
		return null;
	}

	/**
	 * gets the x coordinate of where this move starts
	 * 
	 * @return the x coordinate of the move
	 */
	public int getXCoord() {
		return xCoord;
	}

	/**
	 * gets the y coordinate of where this move starts
	 * 
	 * @return the y coordinate of the move
	 */
	public int getYCoord() {
		return yCoord;
	}

	/**
	 * gets the orientation of this move, true is vertical, false is horizontal
	 * 
	 * @return the orientation of the move
	 */
	public boolean getOrientation() {
		return orientation;
	}
	
	public boolean equals(Object obj){
		if(obj.hashCode() == hashCode()){
			return true;
		}
		return false;
	}
	
	public int hashCode(){
		return 
	}

}