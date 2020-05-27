package com.github.mateusgabi.components;

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

    }
}
