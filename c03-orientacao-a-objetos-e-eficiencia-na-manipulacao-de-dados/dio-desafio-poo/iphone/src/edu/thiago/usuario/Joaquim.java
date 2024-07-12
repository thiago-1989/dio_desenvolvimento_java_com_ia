package edu.thiago.usuario;

import edu.thiago.funcionalidades.iphone.IPhone;

public class Joaquim {
    public static void main(String[] args) {
        IPhone iphone = new IPhone();
        
        iphone.ligar("555");
        iphone.atender();
        iphone.iniciarCorreioVoz();
        iphone.selecionarMusica("N. Pagannini");
        iphone.reproduzir();
        iphone.pausar();
        iphone.exibirPagina("https://web.dio.me/home");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();

    }
}
