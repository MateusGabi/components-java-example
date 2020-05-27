package com.github.mateusgabi.components.BoardGame;

public interface IPiece {

    /**
     * Esse movimento serve apenas para verificar se a peça realiza esse tipo de movimento.
     * Não é validado se outra peça do mesmo player esta nessa posição.
     *
     * @param movement
     * @return
     */
    boolean isMovementAvailable(IMovement movement);
}
