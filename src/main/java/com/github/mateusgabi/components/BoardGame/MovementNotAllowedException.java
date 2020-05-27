package com.github.mateusgabi.components.BoardGame;

public class MovementNotAllowedException extends Exception {
    public MovementNotAllowedException(String message) {
        super(message);
    }
}
