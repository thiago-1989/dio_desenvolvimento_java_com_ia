package edu.thiago.main.java.map.Ordenacao;

public class Evento {
    private String nomeEnvento;
    private String atracao;
    public Evento(String nomeEnvento, String atracao) {
        this.nomeEnvento = nomeEnvento;
        this.atracao = atracao;
    }

    public String getNomeEnvento() {
        return nomeEnvento;
    }

    public String getAtracao() {
        return atracao;
    }

    @Override
    public String toString() {
        return "Evento{" +
                "nomeEnvento='" + nomeEnvento + '\'' +
                ", atracao='" + atracao + '\'' +
                '}';
    }
}
