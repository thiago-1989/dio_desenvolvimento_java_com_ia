package edu.thiago.gof.strategy;

public class TestStrategy {

    public static void main(String[] args) {

        // Testes relaccionados ao Design Pattern Strategy

        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento normal = new ComportamentoNormal();
        Comportamento agresssivo = new ComportamentoAgresssivo();

        Robo robo = new Robo();
        robo.setComportamento(defensivo);
        robo.mover();
        robo.setComportamento(normal);
        robo.mover();
        robo.setComportamento(agresssivo);
        robo.mover();
    }
}