package jogodavelha.jdv;

import jogodavelha.boardgame.Board;

public class JDVMatch {

	private Board board;
	
	public JDVMatch() {
		board = new Board(3,3);
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
}
