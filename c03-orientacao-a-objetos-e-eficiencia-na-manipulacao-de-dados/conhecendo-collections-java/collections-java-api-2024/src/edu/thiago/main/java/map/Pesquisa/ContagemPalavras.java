package edu.thiago.main.java.map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
    private Map<String, Integer> palavras;

    public ContagemPalavras() {
        this.palavras = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, Integer contagem) {
        this.palavras.put(palavra, contagem);
    }

    public void removerPalavra(String palavra) {
        if (!palavras.isEmpty()) {
            if (palavras.containsKey(palavra)) {
                this.palavras.remove(palavra);
                System.out.printf("Palavra '%s' removida com sucesso!\n", palavra);
            } else {
                System.out.println("Palavra não encontrada");
            }
        } else {
            throw new RuntimeException("Conjunto vazio");
        }

    }

    public Integer exibirContagemPalavras() {
        int totPalavras = 0;
        if (!palavras.isEmpty()) {
            for (String palavra : palavras.keySet()) {
                totPalavras += palavras.get(palavra);
            }
            return totPalavras;
        } else {
            throw new RuntimeException("Conjunto vazio");
        }
    }

    public String encontrarPalavrasMaisFrequente() {
        String linguagemMaisFrequente = null;
        int maiorContagem = 0;
        for (String palavra : palavras.keySet()) {
            if (palavras.get(palavra) > maiorContagem) {
                maiorContagem = palavras.get(palavra);
                linguagemMaisFrequente = palavra;
            }
        }
        return linguagemMaisFrequente;
    }

    public static void main(String[] args) {
        ContagemPalavras contagemPalavras = new ContagemPalavras();
        contagemPalavras.adicionarPalavra("Java", 5);
        contagemPalavras.adicionarPalavra("Python", 10);
        contagemPalavras.adicionarPalavra("JavaScript", 2);

        // Exibe a contagem total de linguagens
        System.out.println("Existem " + contagemPalavras.exibirContagemPalavras() + " palavras.");

        // Encontra e exibe a linguagem mais frequente
        String linguagemMaisFrequente = contagemPalavras.encontrarPalavrasMaisFrequente();
        System.out.println("A linguagem mais frequente é: " + linguagemMaisFrequente);

        contagemPalavras.encontrarPalavrasMaisFrequente();
        // Exibe a contagem total de linguagens
      //  System.out.println("Existem " + pesquisa.exibirContagemPalavras() + " palavras.");
/*
        // Encontra e exibe a linguagem mais frequente
        String linguagemMaisFrequente = pesquisa.encontrarPalavrasMaisFrequente();
        System.out.println("A linguagem mais frequente é: " + linguagemMaisFrequente);
*/
    }
}
