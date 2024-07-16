package edu.thiago.main.java.set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    //Atributos
    private Set<Tarefa> tarefasSet;

    public ListaTarefas() {
        this.tarefasSet = new HashSet<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefasSet.add(new Tarefa(descricao, false));
    }

    public void removerTarefa(String descricao) {
        tarefasSet.removeIf(tarefa -> tarefa.getDescricao().equals(descricao));
    }

    public void exibirTarefas() {
        if (!tarefasSet.isEmpty()) {
            System.out.println(tarefasSet);
        } else {
            System.out.println("Tarefa não encontrada");
        }

    }

    public int contarTarefas() {
        return tarefasSet.size();
    }

    public Set<Tarefa> obterTarefasConcluidas() {
        Set<Tarefa> tarefasConcluida = new HashSet<>();
        if (!tarefasSet.isEmpty()) {
            for (Tarefa tarefa : tarefasSet) {
                if (tarefa.getConcluida()) {
                    tarefasConcluida.add(tarefa);
                }
            }
            return tarefasConcluida;
        } else {
            throw new RuntimeException("Conjunto vazio");
        }
    }

    public Set<Tarefa> obterTarefasPendentes() {
        Set<Tarefa> tarefasPendentes = new HashSet<>();
        if (!tarefasSet.isEmpty()) {
            for (Tarefa tarefa : tarefasSet) {
                if (!tarefa.getConcluida()) {
                    tarefasPendentes.add(tarefa);
                }
            }
            return tarefasPendentes;
        } else {
            throw new RuntimeException("Conjunto vazio");
        }
    }

    public void marcarTarefaConcluida(String descricao) {
        if (!tarefasSet.isEmpty()) {
            for (Tarefa tarefa : tarefasSet) {
                if (tarefa.getDescricao().equalsIgnoreCase(descricao)) {
                    tarefa.setConcluida(true);
                }
            }
        } else {
            throw new RuntimeException("Conjunto vazio");
        }
    }

    public void marcarTarefaPendente(String descricao) {
        if (!tarefasSet.isEmpty()) {
            for (Tarefa tarefa : tarefasSet) {
                if (tarefa.getDescricao().equalsIgnoreCase(descricao)) {
                    tarefa.setConcluida(false);
                }
            }
        } else {
            throw new RuntimeException("Conjunto vazio");
        }
    }

    public void limparListaTarefas() {
        tarefasSet.clear();
    }

    public static void main(String[] args) {
        // Criando uma instância da classe ListaTarefas
        ListaTarefas listaTarefas = new ListaTarefas();

        // Adicionando tarefas à lista
        listaTarefas.adicionarTarefa("Estudar Java");
        listaTarefas.adicionarTarefa("Fazer exercícios físicos");
        listaTarefas.adicionarTarefa("Organizar a mesa de trabalho");
        listaTarefas.adicionarTarefa("Ler livro");
        listaTarefas.adicionarTarefa("Preparar apresentação");

        // Exibindo as tarefas na lista
        listaTarefas.exibirTarefas();

        // Removendo uma tarefa
        listaTarefas.removerTarefa("Fazer exercícios físicos");
        listaTarefas.exibirTarefas();

        // Contando o número de tarefas na lista
        System.out.println("Total de tarefas na lista: " + listaTarefas.contarTarefas());

        // Obtendo tarefas pendentes
        System.out.println(listaTarefas.obterTarefasPendentes());

        // Marcando tarefas como concluídas
        listaTarefas.marcarTarefaConcluida("Ler livro");
        listaTarefas.marcarTarefaConcluida("Estudar Java");
        listaTarefas.exibirTarefas();

        // Obtendo tarefas concluídas
        System.out.println(listaTarefas.obterTarefasConcluidas());

        // Marcando tarefas como pendentes
        listaTarefas.marcarTarefaPendente("Estudar Java");
        listaTarefas.exibirTarefas();

        // Limpando a lista de tarefas
        listaTarefas.limparListaTarefas();
        listaTarefas.exibirTarefas();
    }

}
