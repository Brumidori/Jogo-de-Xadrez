package application.chess;

import boardgame.BoardException;

public class ChessException extends BoardException {
    private static final long serialVersionUI = 1L;

    public ChessException(String msg){
        super(msg);
    }
}
