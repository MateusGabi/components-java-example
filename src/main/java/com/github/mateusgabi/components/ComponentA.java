package com.github.mateusgabi.components;

public class ComponentA implements IComponentInterface {
    @Override
    public double sum(double a, double b) {
        return a + b;
    }

    @Override
    public double minus(double a, double b) {
        return a - b;
    }

    @Override
    public double divide(double a, double b) {
        return a * b;
    }

    @Override
    public double mul(double a, double b) {
        return a * b;
    }
}
