package com.github.mateusgabi.components;

import com.github.mateusgabi.components.BoardGame.Chess.Chess;
import com.github.mateusgabi.components.BoardGame.Movement;
import com.github.mateusgabi.components.BoardGame.Position;

public class Application {
    public static void main(String[] args) {

        // consumer with component a
        Consumer consumerA = new Consumer(new ComponentA());
        // consumer with component b
        Consumer consumerB = new Consumer(new ComponentB());

        // calculo da velocidade média
        double a = consumerA.velocidadeMedia(100, 0.5);
        double b = consumerB.velocidadeMedia(100, 0.5);
        System.out.println(a + " / " + b);

        // cálculo da velocidade uniforme
        a = consumerA.movimentoUniforme(1, 10, 20);
        b = consumerB.movimentoUniforme(1, 10, 20);
        System.out.println(a + " / " + b);

        System.out.println("LETS PLAY CHESS!!");
        Chess chess = new Chess();
        chess.start();
        // só para exemplo, rei esta em 0,0 e rainha em 0,1. Tem que negar o movimento do rei, porque eu implementei assim
        chess.requestMovement(new Movement(new Position(0,0), new Position(0, 1)));
        // só para exemplo, rei esta em 0,0 e rainha em 0,1. Tem que negar o movimento do rei, porque eu implementei assim
        chess.requestMovement(new Movement(new Position(1,0), new Position(1, 1)));
        chess.stop();
        chess.shutdown();

    }
}
