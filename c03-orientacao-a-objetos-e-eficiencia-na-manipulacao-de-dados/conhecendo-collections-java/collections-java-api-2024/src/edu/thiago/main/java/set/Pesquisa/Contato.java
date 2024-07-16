package edu.thiago.main.java.set.Pesquisa;

public class Contato {
    private String nome;
    private int numeroContato;

    public Contato(String nome, int numeroContato) {
        this.nome = nome;
        this.numeroContato = numeroContato;
    }

    public String getNome() {
        return nome;
    }

    public int getNumeroContato() {
        return numeroContato;
    }

    public void setNumeroContato(int numeroContato) {
        this.numeroContato = numeroContato;
    }

    @Override
    public String toString() {
        return "Contato{" +
                "nome='" + nome + '\'' +
                ", numeroContato=" + numeroContato +
                '}';
    }
}
