package main.java.map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer> contatos;

    public AgendaContatos() {
        this.contatos = new HashMap<>();
    }
    public void adicionarContato(String nome, Integer telefone){
        this.contatos.put(nome, telefone);
    }
    public void removerContato(String nome){
        if(!contatos.isEmpty())
            contatos.remove(nome);
        else
            System.out.println("Não há como remover contatos, pois a agenda está vazia.");
    }
    public void exibirContatos(){
        if(!contatos.isEmpty())
            System.out.println(contatos);
        else
            System.out.println("Não há como exibir contatos, pois a agenda está vazia.");
    }
    public Integer pesquisarPorNome(String nome){
        Integer numeroPorNome = null;
        if(!contatos.isEmpty()) {
            numeroPorNome = contatos.get(nome);
        if(numeroPorNome == null)
            System.out.println("Número não encontrato na agenda.");
        } else
            System.out.println("A agenda de contatos está vazia.");
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        // Adicionar contatos
        agendaContatos.adicionarContato("Camila", 123456);
        agendaContatos.adicionarContato("João", 5665);
        agendaContatos.adicionarContato("Carlos", 1111111);
        agendaContatos.adicionarContato("Ana", 654987);
        agendaContatos.adicionarContato("Maria", 1111111);
        agendaContatos.adicionarContato("Camila", 44444);

        agendaContatos.exibirContatos();

        // Remover um contato
        agendaContatos.removerContato("Maria");
        agendaContatos.exibirContatos();

        // Pesquisar número por nome
        String nomePesquisa = "João";
        Integer numeroPesquisa = agendaContatos.pesquisarPorNome("João");
        System.out.println("Número de telefone de " + nomePesquisa + ": " + numeroPesquisa);

        String nomePesquisaNaoExistente = "Paula";
        Integer numeroPesquisaNaoExistente = agendaContatos.pesquisarPorNome(nomePesquisaNaoExistente);
        System.out.println("Número de telefone de " + nomePesquisaNaoExistente + ": " + numeroPesquisaNaoExistente);
    }
}

