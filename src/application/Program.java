package application;


import java.util.Scanner;

import chess.ChessException;
import chess.ChessMath;
import chess.ChessPiece;
import chess.ChessPosition;


public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ChessMath chessmath = new ChessMath();
		while(true) {
			try {
				UI.clearScreen();
				UI.printBoard(chessmath.getPieces());
				System.out.println();
				System.out.println("Source: ");
				ChessPosition source = UI.readChessPosition(sc);
				
				boolean[][] possibleMoves = chessmath.possibleMoves(source);
				UI.clearScreen();
				UI.printBoard(chessmath.getPieces(),possibleMoves);
				
				System.out.println();
				System.out.println("target: ");
				ChessPosition target = UI.readChessPosition(sc);
				
				ChessPiece capturedPiece = chessmath.performChessMove(source, target);
			}
			catch (ChessException e) {
				// TODO: handle exception
				System.out.println(e.getMessage());
				sc.nextLine();
			}
		}
		

	}

}
