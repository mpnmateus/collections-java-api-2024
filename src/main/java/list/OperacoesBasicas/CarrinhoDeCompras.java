package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> listaItens;

    public CarrinhoDeCompras() {
        this.listaItens = new ArrayList<Item>();
    }
    public void adicionarItem(String nome, double preco, int quantidade){
        listaItens.add(new Item(nome, preco, quantidade));
    }
    public void removerItem(String nome){
        List<Item> itensParaRemover = new ArrayList<>();
        for(Item i : listaItens)
            if(i.getNome().equalsIgnoreCase(nome))
                itensParaRemover.add(i);
        listaItens.removeAll(itensParaRemover);
    }
    public double calcularValorTotal(){
        double soma = 0;
        for (Item i : listaItens)
            soma += i.getPreco() * i.getQuantidade();
        return soma;
    }
    public void exibirItens(){
        System.out.println("Temos os seguintes itens: " + listaItens);
    }


    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoCompras = new CarrinhoDeCompras();

        carrinhoCompras.adicionarItem("Tomate", 5, 2);
        carrinhoCompras.adicionarItem("Cebola", 5, 5);
        carrinhoCompras.adicionarItem("Cenoura", 5, 5);

        System.out.println("\nO valor total no carrinho atualmente é: R$" + carrinhoCompras.calcularValorTotal());

        carrinhoCompras.exibirItens();

        carrinhoCompras.removerItem("tomate");

        System.out.println("\nO valor total no carrinho atualmente é: R$" + carrinhoCompras.calcularValorTotal());
        carrinhoCompras.exibirItens();

    }
}
