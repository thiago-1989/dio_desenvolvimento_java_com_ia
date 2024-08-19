package edu.thiago.gof.subsistema1.crm;

public class CrmService {
    public static void gravarCliente(String nome, String cep, String cidade, String estado) {
        System.out.printf("Cliente salvo no sistema de CRM:\nNome: %s\nCep: %s\nCidade: %s\nEstado: %s\n", nome, cep, cidade, estado);
    }
}
