package application;


import chess.ChessMath;


public class Program {

	public static void main(String[] args) {
		
		ChessMath chessmath = new ChessMath();
		UI.printBoard(chessmath.getPieces());

	}

}
