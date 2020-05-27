package com.github.mateusgabi.components.BoardGame.Chess.pieces;

import com.github.mateusgabi.components.BoardGame.IMovement;

public class Queen extends ChessPiece {

    public Queen() {
        super(Type.QUEEN);
    }

    @Override
    public boolean isMovementAvailable(IMovement movement) {
        System.out.println("A Rainha é livre e pode movimentar!");
        return true;
    }
}
