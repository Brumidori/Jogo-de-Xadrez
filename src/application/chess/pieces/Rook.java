package application.chess.pieces;

import application.chess.ChessPiece;
import application.chess.Color;
import boardgame.Board;

//torre
public class Rook extends ChessPiece {

    public Rook(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "R";
    }
}