package jogodavelha.jdv;

import jogodavelha.boardgame.Position;

public class JDVPosition {
	
	private char column;
	private int row;
	
	public JDVPosition(char column, int row) {
		if(column<'a' || column>'c' || row<1 || row > 3) {
			throw new JDVException("Error instantiating JDVPosition. Valid values are from a1 to c3");
		}
		this.column = column;
		this.row = row;
	}

	public char getColumn() {
		return column;
	}

	public int getRow() {
		return row;
	}
	
	protected Position toPosition() {
		return new Position(3 - row, column - 'a');
	}
	
	protected static JDVPosition fromPosition(Position position) {
		return new JDVPosition((char)('a' + position.getColumn()), 3 - position.getRow());
	}
	
	public String toString() {
		return ""+column+row;
	}

}
