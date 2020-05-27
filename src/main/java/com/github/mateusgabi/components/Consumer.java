package com.github.mateusgabi.components;

/**
 * Fórmulas em: https://www.sofisica.com.br/conteudos/FormulasEDicas/formulas.php
 * @author mgm
 */
public class Consumer {
    public IComponentInterface component;

    public Consumer(IComponentInterface component) {
        this.component = component;
    }

    public IComponentInterface getComponent() {
        return component;
    }

    public void setComponent(IComponentInterface component) {
        this.component = component;
    }

    public double velocidadeMedia(double distanciaPercorrida, double intervaloDeTempo) {
        return component.divide(distanciaPercorrida, intervaloDeTempo);
    }

    public double movimentoUniforme(double posicaoInicial, double velocidade, double intervaloDeTempo) {
        return component.sum(
                posicaoInicial,
                component.mul(
                        velocidade,
                        intervaloDeTempo
                )
        );
    }
}
