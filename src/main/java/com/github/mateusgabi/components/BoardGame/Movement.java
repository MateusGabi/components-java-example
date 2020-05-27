package com.github.mateusgabi.components.BoardGame;

public class Movement implements IMovement {
    private Position origin;
    private Position destiny;

    public Movement(Position origin, Position destiny) {
        this.origin = origin;
        this.destiny = destiny;
    }

    @Override
    public Position getOriginPosition() {
        return origin;
    }

    @Override
    public Position getDestinyPosition() {
        return destiny;
    }
}
