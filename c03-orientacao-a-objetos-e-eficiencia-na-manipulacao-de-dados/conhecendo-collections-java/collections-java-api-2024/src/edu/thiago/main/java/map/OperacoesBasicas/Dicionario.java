package edu.thiago.main.java.map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    //Atributo

    Map<String, String> dicionario;

    public Dicionario() {
        dicionario = new HashMap<>();
    }

    public void adicionarPalavra(String palvra, String definicao) {
        dicionario.put(palvra, definicao);
    }

    public void removerPalavra(String palvra) {
        if (!dicionario.isEmpty()) {
            dicionario.remove(palvra);
            System.out.println("Palavra '" + palvra + "' removida com sucesso!");

        }
        dicionario.remove(palvra);
    }

    public void exibirPalavra() {
        if (!dicionario.isEmpty()) {
            System.out.println(dicionario);
        }
    }

    public String pesquisarPorPalavra(String palavra) {
        if (!dicionario.isEmpty()) {
            if (dicionario.containsKey(palavra)) {
                palavra = dicionario.get(palavra);
                return palavra;
            } else {
                return "Palavra não encontrada";
            }
        }else {
            return "Agenda vazia";
    }
}

public static void main(String[] args) {
    Dicionario dicionario = new Dicionario();
    dicionario.adicionarPalavra("Concatenar", "Unir; Juntar");
    dicionario.exibirPalavra();
    // dicionario.removerPalavra("Concatenar");
    dicionario.exibirPalavra();
    dicionario.pesquisarPorPalavra("Concatenar");

    // Adicionar palavras (linguagens de programação)
    dicionario.adicionarPalavra("java", "Linguagem de programação orientada a objetos.");
    dicionario.adicionarPalavra("typescript", "Superset da linguagem JavaScript que adiciona tipagem estática.");
    dicionario.adicionarPalavra("kotlin", "Linguagem moderna de programação para a JVM.");

    // Exibir todas as palavras
    dicionario.exibirPalavra();

    // Pesquisar palavras
    String definicaoJava = dicionario.pesquisarPorPalavra("java");
    System.out.println("Definição da linguagem 'java': " + definicaoJava);

    String definicaoCSharp = dicionario.pesquisarPorPalavra("csharp");
    System.out.println(definicaoCSharp);

    // Remover uma palavra
    dicionario.removerPalavra("typescript");
    dicionario.exibirPalavra();
}
}
