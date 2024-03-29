package jogodavelha.application;

import jogodavelha.jdv.JDVPiece;

public class UI {

	public static void printBoard(JDVPiece[][] pieces) {
		for(int i=0; i<pieces.length;i++) {
			System.out.print((3 - i + " "));
			for(int j = 0; j<pieces.length;j++) {
				printPiece(pieces[i][j]);
			}
			System.out.println();
		}
		System.out.println("   a   b   c");
	}
	
	public static void printPiece(JDVPiece piece) {
		if(piece == null) {
			System.out.print("[ ]");
		}
		else {
			System.out.print(piece);
		}
		System.out.print(" ");
	}
}
