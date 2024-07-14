package edu.thiago.main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    //Atributos
    List<Item> carrinho = new ArrayList<>();

    public CarrinhoDeCompras() {
        this.carrinho = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        Item item = new Item(nome, preco, quantidade);
        this.carrinho.add(item);
    }

    public void removerItem(String nome) {
        List<Item> itemsParaRemover = new ArrayList<>();
        for (Item item : carrinho) {
            if (item.getNome().equalsIgnoreCase(nome)) {
                itemsParaRemover.add(item);
            }
        }
        carrinho.removeAll(itemsParaRemover);
    }

    public double calcularValorTotal() {
        double total = 0;
        for (Item item : carrinho) {
            total += item.getPreco();
        }
        return total;
    }

    public void exibirItens() {
        if (!carrinho.isEmpty()) {
            for (Item item : carrinho) {
                System.out.println(item);
            }
        } else {
            System.out.println("Carrinho vazio");
        }

    }

    public static void main(String[] args) {
        // Criando uma instância do carrinho de compras
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        // Adicionando itens ao carrinho
        carrinhoDeCompras.adicionarItem("Lápis", 2d, 3);
        carrinhoDeCompras.adicionarItem("Lápis", 2d, 3);
        carrinhoDeCompras.adicionarItem("Caderno", 35d, 1);
        carrinhoDeCompras.adicionarItem("Borracha", 2d, 2);

        // Exibindo os itens no carrinho
        carrinhoDeCompras.exibirItens();
        // Calculando e exibindo o valor total da compra
        System.out.println("O valor total da compra é = " + carrinhoDeCompras.calcularValorTotal());

        System.out.println();

        // Removendo um item do carrinho
        carrinhoDeCompras.removerItem("Lápis");

        // Exibindo os itens atualizados no carrinho
        carrinhoDeCompras.exibirItens();

        // Calculando e exibindo o valor total da compra
        System.out.println("O valor total da compra é = " + carrinhoDeCompras.calcularValorTotal());
    }

}

