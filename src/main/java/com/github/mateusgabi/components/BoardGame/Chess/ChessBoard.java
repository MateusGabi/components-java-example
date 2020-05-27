package com.github.mateusgabi.components.BoardGame.Chess;

import com.github.mateusgabi.components.BoardGame.*;
import com.github.mateusgabi.components.BoardGame.Chess.pieces.ChessPiece;
import com.github.mateusgabi.components.BoardGame.Chess.pieces.King;
import com.github.mateusgabi.components.BoardGame.Chess.pieces.Queen;

import java.util.ArrayList;

public class ChessBoard implements IBoardGame {

    private ArrayList<ChessPiece> pieces;

    public ChessBoard() {
        // set pieces;
        this.pieces = new ArrayList<>(64);
        this.pieces.add(0, new King());
        this.pieces.add(1, new Queen());
    }

    @Override
    public void movePiece(IMovement movement) throws MovementNotAllowedException {
        Position origin = movement.getOriginPosition();

        // regra de negócio para mapear X, Y para posição em lista
        int index = getCollectionIndex(origin);
        ChessPiece chessPiece = this.pieces.get(index);

       if (chessPiece.isMovementAvailable(movement)) {
           // move piece and "eat" enemy piece
           System.out.println("Movement allowed and bloh moved!");
       } else {
           throw new MovementNotAllowedException("This movement is not allowed.");
       }

    }

    private int getCollectionIndex(Position origin) {
        return origin.getX() + 8 * origin.getY();
    }
}
