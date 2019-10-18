package jogodavelha.jdv.pieces;

import jogodavelha.boardgame.Board;
import jogodavelha.jdv.JDVPiece;
import jogodavelha.jdv.Players;

public class Xis extends JDVPiece {

	public Xis(Board board, Players player) {
		super(board, player);
		}
	
	public String toString() {
		return "[X]";
	}

}
