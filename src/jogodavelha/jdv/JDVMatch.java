package jogodavelha.jdv;

import jogodavelha.boardgame.Board;
import jogodavelha.jdv.pieces.Bola;
import jogodavelha.jdv.pieces.Xis;

public class JDVMatch {

	private Board board;
	
	public JDVMatch() {
		board = new Board(3,3);
		testSetup();
	}
	
	public JDVPiece[][] getPieces(){
		JDVPiece[][] mat = new JDVPiece[board.getRows()][board.getColumns()];
		for(int i=0;i<board.getRows();i++) {
			for(int j=0; j<board.getColumns();j++) {
				mat[i][j] = (JDVPiece) board.piece(i,j);
			}
		}
		return mat;
	}
	
	private void placeNewPiece(char column, int row, JDVPiece piece) {
		board.placePiece(piece, new JDVPosition(column, row).toPosition());
	}
	
	private void testSetup() {
		placeNewPiece('a', 2, new Xis(board, Players.XIS));
		placeNewPiece('b', 3, new Bola(board, Players.BOLA));
	}
}
