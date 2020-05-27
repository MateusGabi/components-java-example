package com.github.mateusgabi.components.BoardGame.Chess.pieces;

import com.github.mateusgabi.components.BoardGame.IMovement;
import com.github.mateusgabi.components.BoardGame.Position;

public class King extends ChessPiece {
    public King(Variant variant) {
        super(Type.KING, variant);
    }

    @Override
    public boolean isMovementAvailable(IMovement movement) {
        Position originPosition = movement.getOriginPosition();
        Position destinyPosition = movement.getDestinyPosition();

        System.out.println("Rei não pode movimentar!");

        return false;
    }
}
