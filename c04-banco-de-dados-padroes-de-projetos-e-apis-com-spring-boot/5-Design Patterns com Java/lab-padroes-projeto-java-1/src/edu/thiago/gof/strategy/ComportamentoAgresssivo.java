package edu.thiago.gof.strategy;

public class ComportamentoAgresssivo implements Comportamento {

    @Override
    public void mover() {
        System.out.println("Movendo-se agressivamente...");
    }
}
