package com.JEE.testing;

public class Context {
	private Strategy strategy;
    public void executeStrategy() {
        if (strategy != null) {
            strategy.execute();
        } else {
            System.out.println("Aucune stratégie définie");
        }
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
}
