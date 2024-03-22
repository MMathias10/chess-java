package application;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import chess.ChessException;
import chess.ChessMath;
import chess.ChessPiece;
import chess.ChessPosition;


public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ChessMath chessmath = new ChessMath();
		List<ChessPiece> captured = new ArrayList<>();
		while(true) {
			try {
				UI.clearScreen();
				UI.printMatch(chessmath, captured);
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
			
				if(capturedPiece != null) {
					captured.add(capturedPiece);
				}
			}
			catch (ChessException e) {
				// TODO: handle exception
				System.out.println(e.getMessage());
				sc.nextLine();
			}
		}
		

	}

}
