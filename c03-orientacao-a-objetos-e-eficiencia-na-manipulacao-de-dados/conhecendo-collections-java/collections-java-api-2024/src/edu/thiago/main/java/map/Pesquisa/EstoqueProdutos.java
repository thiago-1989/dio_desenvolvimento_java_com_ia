package edu.thiago.main.java.map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {

    Map<Long, Produto> estoqueProdutos;

    public EstoqueProdutos() {
        estoqueProdutos = new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome, int quantidade, double preco) {
        estoqueProdutos.put(cod, new Produto(nome, quantidade, preco));
    }

    public void exibirProdutos() {
        if (!estoqueProdutos.isEmpty()) {
            System.out.println(estoqueProdutos);
        } else {
            System.out.println("Estoque vazio");
        }
    }

    public Double calcularValorTotalEstoque() {
        double total = 0;
        if (!estoqueProdutos.isEmpty()) {
            for (Produto produto : estoqueProdutos.values()) {
                double valor = produto.getPreco() * produto.getQuantidade();
                total += valor;
            }
        }
        return total;

    }

    public Produto obterProdutoMaisCaro() {
        if (!estoqueProdutos.isEmpty()) {
            Produto produtoMaisCaro = null;
            double maiorPreco = Double.MIN_VALUE;
            for (Produto produto : estoqueProdutos.values()) {
                if (produto.getPreco() > maiorPreco) {
                    produtoMaisCaro = produto;
                    maiorPreco = produto.getPreco();
                }
            }
            return produtoMaisCaro;
        } else {
            throw new RuntimeException("Estoque vazio");        }
    }

    public Produto obterProdutoMaisBarato() {
        if (!estoqueProdutos.isEmpty()) {
            Produto produtoMaisBarato = obterProdutoMaisCaro();
            double menorPreco = produtoMaisBarato.getPreco();
            for (Produto produto : estoqueProdutos.values()) {
                if (produto.getPreco() < menorPreco) {
                    produtoMaisBarato = produto;
                    menorPreco = produto.getPreco();
                }
            }
            return produtoMaisBarato;
        } else {
            throw new RuntimeException("Estoque vazio");        }
    }

    public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque() {

        if (!estoqueProdutos.isEmpty()) {
            Produto maisCaro = null;
            double maiorValor = estoqueProdutos.values().iterator().next().getPreco();
            for (Produto produto : estoqueProdutos.values()) {
                double estoqueProduto = produto.getPreco() * produto.getQuantidade();
                if (estoqueProduto > maiorValor) {
                    maiorValor = estoqueProduto;
                    maisCaro = produto;
                }

            }
            return maisCaro;
        } else {
            throw new RuntimeException("Estoque vazio");
        }
    }

    public static void main(String[] args) {
        EstoqueProdutos estoqueProdutos = new EstoqueProdutos();

        estoqueProdutos.adicionarProduto(1, "AnaMaria", 10, 2.5);
        estoqueProdutos.adicionarProduto(2, "Nescau", 10, 10);
        estoqueProdutos.adicionarProduto(3, "Paçoca", 50, 1.0);
        System.out.println(estoqueProdutos.estoqueProdutos);
        System.out.println(estoqueProdutos.calcularValorTotalEstoque());
        System.out.println(estoqueProdutos.obterProdutoMaisCaro());
        System.out.println(estoqueProdutos.obterProdutoMaisBarato());
        estoqueProdutos.obterProdutoMaiorQuantidadeValorTotalNoEstoque();

        EstoqueProdutos estoque = new EstoqueProdutos();

        // Exibe o estoque vazio
        estoque.exibirProdutos();

        // Adiciona produtos ao estoque
        estoque.adicionarProduto(1L, "Notebook", 1, 1500.0);
        estoque.adicionarProduto(2L, "Mouse", 5, 25.0);
        estoque.adicionarProduto(3L, "Monitor", 10, 400.0);
        estoque.adicionarProduto(4L, "Teclado", 2, 40.0);

        // Exibe os produtos no estoque
        estoque.exibirProdutos();

        // Calcula e exibe o valor total do estoque
        System.out.println("Valor total do estoque: R$" + estoque.calcularValorTotalEstoque());

        // Obtém e exibe o produto mais caro
        Produto produtoMaisCaro = estoque.obterProdutoMaisCaro();
        System.out.println("Produto mais caro: " + produtoMaisCaro);

        // Obtém e exibe o produto mais barato
        Produto produtoMaisBarato = estoque.obterProdutoMaisBarato();
        System.out.println("Produto mais barato: " + produtoMaisBarato);

        // Obtém e exibe o produto com a maior quantidade em valor no estoque
        Produto produtoMaiorQuantidadeValorTotal = estoque.obterProdutoMaiorQuantidadeValorTotalNoEstoque();
        System.out.println("Produto com maior quantidade em valor no estoque: " + produtoMaiorQuantidadeValorTotal);

    }
}
