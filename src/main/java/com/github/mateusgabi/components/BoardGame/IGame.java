package com.github.mateusgabi.components.BoardGame;

public interface IGame {
    void setUp();
    void start();
    void requestMovement(IMovement movement);
    void display();
    void stop();
    void shutdown();
}
