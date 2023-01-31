package application.chess.pieces;

import application.chess.ChessPiece;
import application.chess.Color;
import boardgame.Board;

public class King extends ChessPiece {
    public King(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString(){
        return "K";
    }
}
