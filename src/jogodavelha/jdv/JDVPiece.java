package jogodavelha.jdv;

import jogodavelha.boardgame.Board;
import jogodavelha.boardgame.Piece;

public class JDVPiece extends Piece {

	private Players player;

	public JDVPiece(Board board, Players player) {
		super(board);
		this.player = player;
	}

	public Players getPlayer() {
		return player;
	}
	
	
	
}
