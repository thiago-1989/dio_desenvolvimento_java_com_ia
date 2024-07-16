package edu.thiago.main.java.map.Ordenacao;

import edu.thiago.main.java.map.OperacoesBasicas.AgendaContatos;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class AgendaEventos {

    private Map<LocalDate, Evento> agenda;

    public AgendaEventos() {
        this.agenda = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nomeEvento, String atracao) {
        Evento evento = new Evento(nomeEvento, atracao);
        agenda.put(data, evento);
    }

    public void exibirAgenda() {
        Map<LocalDate, Evento> agendaTreeMap = new TreeMap<>(agenda);
        System.out.println(agendaTreeMap);
    }

    public  void obterProximoEvento() {
        agenda = new TreeMap<>(agenda);
        LocalDate data = LocalDate.now();
        LocalDate proximaData =  null;
        Evento proximaEvento = null;
        if (!agenda.isEmpty()) {
            for (Map.Entry<LocalDate, Evento> entry : agenda.entrySet()) {
                if (entry.getKey().isEqual(data) || entry.getKey().isAfter(data)) {
                    proximaData = entry.getKey();
                    proximaEvento = entry.getValue();
                    System.out.printf("O próximo evento: %s acontecerá na data %s\n", proximaEvento, proximaData);
                    break;
                }
            }
        } else {
            throw new RuntimeException("Agenda vazia");
        }
    }


    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();
        agendaEventos.adicionarEvento(LocalDate.of(2024, 10, 1),  "Reunião para Mocidade", "Busca de dons");
        agendaEventos.adicionarEvento(LocalDate.of(2022, 5, 20), "Culto oficio", "Batismo" );
        agendaEventos.adicionarEvento(LocalDate.of(2024, 8, 1),  "Busca de Dons", "Buscar o céu");
        agendaEventos.adicionarEvento(LocalDate.of(2023, 5, 20), "Culto", "Louvores a Deus" );
        agendaEventos.exibirAgenda();
        agendaEventos.obterProximoEvento();
    }
}
