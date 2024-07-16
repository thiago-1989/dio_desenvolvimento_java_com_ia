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
            System.out.println(estoqueProdutos.toString());
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
            Double maiorPreco = Double.MIN_VALUE;
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
            Double menorPreco = produtoMaisBarato.getPreco();
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

    public void obterProdutoMaiorQuantidadeValorTotalNoEstoque() {
        if (!estoqueProdutos.isEmpty()) {
            Produto maisCaro = null;
            Double maiorValor = estoqueProdutos.values().iterator().next().getPreco();
            for (Produto produto : estoqueProdutos.values()) {
                double estoqueProduto = produto.getPreco() * produto.getQuantidade();
                if (estoqueProduto > maiorValor) {
                    maiorValor = estoqueProduto;
                    maisCaro = produto;
                }

            }
            System.out.println("Produto com maior valor em estoque: " + maisCaro.getNome() + " com R$" + maiorValor + " no total");
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
    }
}
