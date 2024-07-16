package edu.thiago.main.java.map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer> agendaMap;

    public AgendaContatos() {
        this.agendaMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone) {
        agendaMap.put(nome, telefone);
    }

    public void removerContato(String nome) {
        if (!agendaMap.isEmpty()) {
            if (agendaMap.containsKey(nome)) {
                agendaMap.remove(nome);
                System.out.println(nome + " removido com sucesso!");
            } else {
                System.out.println("Nome não encontrado");
            }
        } else {
            System.out.println("Agenda vazia");
        }
    }

    public void exibirContatos() {
        if (!agendaMap.isEmpty()) {
            for (Map.Entry<String, Integer> entry : agendaMap.entrySet()) {
                System.out.println("Nome: " + entry.getKey() + "\nNúmero do telefone: " + entry.getValue());
            }
        } else {
            System.out.println("Agenda vazia");
        }
    }

    public void pesquisarPorNome(String nome) {
        if (!agendaMap.isEmpty()) {
            for (Map.Entry<String, Integer> entry : agendaMap.entrySet()) {
                if (entry.getKey().equals(nome)) {
                    System.out.println("Telefone: " + entry.getValue());
                }
            }
        }
    }

    public Integer numeroPorNome(String nome) {
        Integer numeroPorNome = null;
        if (!agendaMap.isEmpty()) {
            numeroPorNome = agendaMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {

        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Thiago", 999888777);
        System.out.println(agendaContatos.agendaMap);
        //agenda.removerContato("Thiago");
        agendaContatos.exibirContatos();
        agendaContatos.pesquisarPorNome("Thiago");
        System.out.println(agendaContatos.numeroPorNome("Thiago"));

        // Adicionar contatos
        agendaContatos.adicionarContato("Camila", 123456);
        agendaContatos.adicionarContato("João", 5665);
        agendaContatos.adicionarContato("Carlos", 1111111);
        agendaContatos.adicionarContato("Ana", 654987);
        agendaContatos.adicionarContato("Maria", 1111111);
        agendaContatos.adicionarContato("Camila", 44444);

        agendaContatos.exibirContatos();

        // Remover um contato
        agendaContatos.removerContato("Maria");
        agendaContatos.exibirContatos();

        // Pesquisar número por nome
        String nomePesquisa = "João";
        Integer numeroPesquisa = agendaContatos.numeroPorNome("João");
        System.out.println("Número de telefone de " + nomePesquisa + ": " + numeroPesquisa);

        String nomePesquisaNaoExistente = "Paula";
        Integer numeroPesquisaNaoExistente = agendaContatos.numeroPorNome(nomePesquisaNaoExistente);
        System.out.println("Número de telefone de " + nomePesquisaNaoExistente + ": " + numeroPesquisaNaoExistente);
    }

}
