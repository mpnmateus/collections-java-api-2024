package main.java.map.Pesquisa;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

import static java.lang.Double.MAX_VALUE;
import static java.lang.Double.MIN_VALUE;

public class EstoqueProdutos {
    private Map<Long, Produto> estoqueProdutosMap;

    public EstoqueProdutos() {
        this.estoqueProdutosMap = new HashMap<>();
    }

    public void adicionarProduto(String nome, int quantidade, double preco){
        this.estoqueProdutosMap.put(ThreadLocalRandom.current().nextLong(0, 100_000), new Produto(nome, quantidade, preco));
    }
    public void exibirProdutos(){
        if(!estoqueProdutosMap.isEmpty())
            System.out.println(estoqueProdutosMap);
        else
            System.out.println("Estoque sem produtos.");
    }

    public double calcularValorTotalEstoque(){
        double valorTotalEstoque = 0;
        if(!estoqueProdutosMap.isEmpty()) {
            for(Produto prod : estoqueProdutosMap.values())
                valorTotalEstoque += prod.getPreco() * prod.getQuantidade();
        } else
            System.out.println("Estoque sem produtos.");

        return valorTotalEstoque;
    }
    public Produto obterProdutoMaisCaro(){
        double valorProdMaisCaro = Double.MIN_VALUE;
        Produto produtoMaisCaro = null;
        if(!estoqueProdutosMap.isEmpty()) {
            for (Produto prod : estoqueProdutosMap.values())
                if (prod.getPreco() > valorProdMaisCaro) {
                    valorProdMaisCaro = prod.getPreco();
                    produtoMaisCaro = prod;
                }
        } else
            System.out.println("Estoque sem produtos.");

        return produtoMaisCaro;
    }
    public Produto obterProdutoMaisBarato() {
        double valorProdMaisBarato = MAX_VALUE;
        Produto produtoMaisBarato = null;
        if(!estoqueProdutosMap.isEmpty()) {
            for(Produto prod : estoqueProdutosMap.values())
                if(prod.getPreco() < valorProdMaisBarato){
                    valorProdMaisBarato = prod.getPreco();
                    produtoMaisBarato = prod;
                }
        } else
            System.out.println("Estoque sem produtos.");

        return produtoMaisBarato;
    }

    public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque(){
        double maiorValorTotalNoEstoque = MIN_VALUE;
        Produto produtoMaiorQuantidadeValorTotalNoEstoque = null;
        if(!estoqueProdutosMap.isEmpty()) {
            double calculoPorProduto = 0;
            for(Produto prod : estoqueProdutosMap.values()) {
                calculoPorProduto = prod.getPreco() * prod.getQuantidade();
                if(calculoPorProduto > maiorValorTotalNoEstoque) {
                    maiorValorTotalNoEstoque = calculoPorProduto;
                    produtoMaiorQuantidadeValorTotalNoEstoque = prod;
                }
            }
        } else
            System.out.println("Estoque sem produtos.");

        return produtoMaiorQuantidadeValorTotalNoEstoque;
    }


    public static void main(String[] args) {
        EstoqueProdutos estoqueProdutos = new EstoqueProdutos();

        // Adicionando Produtos
        estoqueProdutos.adicionarProduto("Cebola", 5, 6.7);
        estoqueProdutos.adicionarProduto("Alho", 2, 4.5);
        estoqueProdutos.adicionarProduto("Tomate", 5, 15.20);
        estoqueProdutos.adicionarProduto("Tomilho", 2, 5.3);
        estoqueProdutos.adicionarProduto("Cogumelo Shitake", 5, 30.10);

        // Exibindo estoque de Produtos
        estoqueProdutos.exibirProdutos();

        // Exibindo produto mais caro
        System.out.println("O produto mais caro do estoque é: " + estoqueProdutos.obterProdutoMaisCaro().getNome());

        // Exibindo produto mais barato
        System.out.println("O produto mais barato do estoque é: " + estoqueProdutos.obterProdutoMaisBarato().getNome());

        // Exibindo o produto com maior valor em estoque (preco * quant)
        System.out.println("O produto com maior em estoque é: " + estoqueProdutos.obterProdutoMaiorQuantidadeValorTotalNoEstoque().getNome());

        // Exibindo o valor total do estoque
        System.out.println("O valor total do estoque é: " + estoqueProdutos.calcularValorTotalEstoque());

    }
}
