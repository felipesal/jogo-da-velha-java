package jogodavelha.jdv.pieces;

import jogodavelha.boardgame.Board;
import jogodavelha.jdv.JDVPiece;
import jogodavelha.jdv.Players;

public class Bola extends JDVPiece {

	public Bola(Board board, Players player) {
		super(board, player);
		}
	
	public String toString() {
		return "[O]";
	}

}
