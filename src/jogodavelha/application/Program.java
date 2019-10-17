package jogodavelha.application;

import jogodavelha.boardgame.Board;
import jogodavelha.jdv.JDVMatch;

public class Program {

	public static void main(String[] args) {

		JDVMatch jdvMatch = new JDVMatch();
		UI.printBoard(jdvMatch.getPieces());
		
	}

}
