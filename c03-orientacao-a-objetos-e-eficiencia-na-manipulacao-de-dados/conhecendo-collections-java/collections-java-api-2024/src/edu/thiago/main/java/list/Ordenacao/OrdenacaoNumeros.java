package edu.thiago.main.java.list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    List<Integer> listaNumeros = new ArrayList<>();

    public OrdenacaoNumeros() {
        this.listaNumeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        listaNumeros.add(numero);
    }

    public List<Integer> ordenarAscendente() {
        List<Integer> listaAscendente = new ArrayList<>(listaNumeros);
        if (!listaNumeros.isEmpty()) {
            Collections.sort(listaAscendente);
        } else {
            throw new IllegalArgumentException("Lista vazia");
        }
        return listaAscendente;
    }

    public List<Integer> ordenarDescendente() {
        List<Integer> listaDescententes = new ArrayList<>(listaNumeros);
        if (!listaNumeros.isEmpty()) {
            Collections.sort(listaDescententes, Collections.reverseOrder());
        } else {
            throw new IllegalArgumentException("Lista vazia");
        }
        return listaDescententes;
    }

    public void exibirNumeros() {
        System.out.println(this.listaNumeros);
    }

    public static void main(String[] args) {
        // Criando uma instância da classe OrdenacaoNumeros
        OrdenacaoNumeros numeros = new OrdenacaoNumeros();

        // Adicionando números à lista
        numeros.adicionarNumero(2);
        numeros.adicionarNumero(5);
        numeros.adicionarNumero(4);
        numeros.adicionarNumero(1);
        numeros.adicionarNumero(99);

        // Exibindo a lista de números adicionados
        numeros.exibirNumeros();

        // Ordenando e exibindo em ordem ascendente
        System.out.println(numeros.ordenarAscendente());

        // Exibindo a lista
        numeros.exibirNumeros();

        // Ordenando e exibindo em ordem descendente
        System.out.println(numeros.ordenarDescendente());

        // Exibindo a lista
        numeros.exibirNumeros();
    }
}
