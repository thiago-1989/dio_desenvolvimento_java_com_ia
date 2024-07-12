package edu.thiago.funcionalidades.iphone;

import edu.thiago.funcionalidades.navegador.Navegador;
import edu.thiago.funcionalidades.telefone.Telefone;
import edu.thiago.funcionalidades.reprodutor.Reprodutor;

public class IPhone implements Telefone, Reprodutor, Navegador {

    public void ligar(String numero) {
        System.out.println("Ligando de Iphone");
    }

    public void atender() {
        System.out.println("Atendendo de Iphone");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Correio de voz de Iphone");
    }

    public void reproduzir() {
        System.out.println("Reproduzindo música em Iphone");
    }

    public void pausar() {
        System.out.println("Música pausada em Iphone");
    }

    public void selecionarMusica(String musica) {
        System.out.println("Música selecionada em Iphone: " + musica);
    }

    public void exibirPagina(String url) {
        System.out.println("Exibindo pagina em Iphone: " + url);
    }

    public void adicionarNovaAba() {
        System.out.println("Adicionada nova aba em Iphone");
    }

    public void atualizarPagina() {
        System.out.println("Página atualizada em Iphone");
    }

}
