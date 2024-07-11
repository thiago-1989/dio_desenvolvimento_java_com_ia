package edu.thiago.enums;

public class SistemaIbge {
    public static void main(String[] args) {
        for (EstadoBrasileiro e: EstadoBrasileiro.values()) {
            System.out.println(e.getSigla() + " - " + e.getNome() + "(" + e.getIbge() + ")");
        }
        //selecionando um estado a partir das opções disponíveis
        EstadoBrasileiro uf = EstadoBrasileiro.PIAUI;

        System.out.println("O estado selecionado foi: " + uf.getNome());
        System.out.println("Sigla: " + uf.getSigla());
        System.out.println("Nome em maiúsculo: " + uf.getNomeMaiusculo());
        System.out.println("IBGE: " + uf.getIbge());
    }
}
