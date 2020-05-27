package com.github.mateusgabi.components.BoardGame.Chess;

import com.github.mateusgabi.components.BoardGame.*;

public class Chess implements IGame {
    private IBoardGame boardGame;

    @Override
    public void setUp() {
        System.out.println("Setting up game...");

        this.boardGame = new ChessBoard();

        System.out.println("Game ready to play...");
    }

    @Override
    public void start() {
        System.out.println("Starting chess...");
        this.setUp();
    }

    @Override
    public void requestMovement(IMovement movement) {
        try {
            this.boardGame.movePiece(movement);
        } catch (MovementNotAllowedException e) {
            System.out.println("Movement not allowed! Next Player turn.");
        }
    }

    @Override
    public void display() {
        System.out.println("SHOW CHESS BOARD");
    }

    @Override
    public void stop() {
        System.out.println("Pause for relaxing");
    }

    @Override
    public void shutdown() {

    }
}
