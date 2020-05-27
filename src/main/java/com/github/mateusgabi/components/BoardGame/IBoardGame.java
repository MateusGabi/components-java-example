package com.github.mateusgabi.components.BoardGame;

public interface IBoardGame {
    void movePiece(IMovement movement) throws MovementNotAllowedException;
}
