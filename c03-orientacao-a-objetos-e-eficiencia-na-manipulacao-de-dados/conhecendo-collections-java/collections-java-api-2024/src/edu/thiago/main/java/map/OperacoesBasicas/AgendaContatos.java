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
        AgendaContatos agenda = new AgendaContatos();
        agenda.adicionarContato("Thiago", 999888777);
        System.out.println(agenda.agendaMap);
        //agenda.removerContato("Thiago");
        agenda.exibirContatos();
        agenda.pesquisarPorNome("Thiago");
        System.out.println(agenda.numeroPorNome("Thiago"));
    }

}
