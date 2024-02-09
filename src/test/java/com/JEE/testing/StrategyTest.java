package com.JEE.testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StrategyTest {

	@Test
    public void testConcreteStrategyA() {
        Context context = new Context();
        context.setStrategy(new ConcreteStrategyA());

        // Exécute la stratégie A
        context.executeStrategy();

        // Ajoutez des assertions si nécessaire
    }

    @Test
    public void testConcreteStrategyB() {
        Context context = new Context();
        context.setStrategy(new ConcreteStrategyB());

        // Exécute la stratégie B
        context.executeStrategy();

        // Ajoutez des assertions si nécessaire
    }

    @Test
    public void testContextChangeStrategy() {
        Context context = new Context();
        Strategy strategyA = new ConcreteStrategyA();
        Strategy strategyB = new ConcreteStrategyB();

        // Définit la stratégie A
        context.setStrategy(strategyA);
        context.executeStrategy();

        // Change la stratégie à B
        context.setStrategy(strategyB);
        context.executeStrategy();

        // Ajoutez des assertions si nécessaire
    }

}
