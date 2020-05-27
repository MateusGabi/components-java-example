package com.github.mateusgabi.components;

import java.math.BigDecimal;

public class ComponentB implements IComponentInterface {
    @Override
    public double sum(double a, double b) {
        BigDecimal aBD = new BigDecimal(a);
        BigDecimal bBD = new BigDecimal(b);

        return new Double(aBD.add(bBD).toPlainString()).doubleValue();
    }

    @Override
    public double minus(double a, double b) {
        return 0;
    }

    @Override
    public double divide(double a, double b) {
        return 0;
    }

    @Override
    public double mul(double a, double b) {
        return 0;
    }
}
