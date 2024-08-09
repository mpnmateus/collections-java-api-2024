package main.java.set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero){
        contatoSet.add(new Contato(nome, numero));
    }
    public Set<Contato> exibirContatos(){
        return contatoSet;
    }
    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatosPorNome = new HashSet<>();
        for(Contato c : contatoSet)
            if(c.getNome().startsWith(nome))
                contatosPorNome.add(c);
        return contatosPorNome;
    }
    public Contato atualizarNumeroContato(String nome, int novoNumero){
        Contato contatoAtualizado = null;
        for(Contato c : contatoSet)
            if(c.getNome().equalsIgnoreCase(nome)) {
                c.setNumTelefone(novoNumero);
                contatoAtualizado = c;
                break;
            }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agendaC = new AgendaContatos();

        agendaC.adicionarContato("Mateus Pettenuzzo", 32325050);
        agendaC.adicionarContato("Mateus Pettenuzzo", 33333333);
        agendaC.adicionarContato("Mateus José", 99558585);
        agendaC.adicionarContato("Maria Tanara", 30201789);
        agendaC.adicionarContato("Maria Curso", 99994444);

        // Exibindo os contatos na agenda
        System.out.println(agendaC.exibirContatos());

        // Pesquisando contatos pelo nome
        System.out.println(agendaC.pesquisarPorNome("Maria"));

        // Atualizando o número de um contato
        Contato contatoAtualizado = agendaC.atualizarNumeroContato("Mateus Pettenuzzo", 99349944);
        System.out.println("Contato atualizado : " + contatoAtualizado);

        // Exibindo os contatos atualizados na agenda
        System.out.println("Contatos na agenda após atualização:");
        System.out.println(agendaC.exibirContatos());

    }

}
