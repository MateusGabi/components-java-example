package com.github.mateusgabi.components.BoardGame.Chess.pieces;

import com.github.mateusgabi.components.BoardGame.IMovement;
import com.github.mateusgabi.components.BoardGame.IPiece;
import com.github.mateusgabi.components.BoardGame.Movement;
import com.github.mateusgabi.components.BoardGame.Position;

public abstract class ChessPiece implements IPiece {

    private Type type;
    private Variant variant;

    public ChessPiece(Type type, Variant variant) {
        this.type = type;
        this.variant = variant;
    }

    @Override
    public abstract boolean isMovementAvailable(IMovement movement);

    static enum Type {
        // outras peças
        QUEEN, KING
    }

    public static enum Variant {
        BLACK, WHITE
    }
}
