package main.java.set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    private Set<Tarefa> listaTarefas;

    public ListaTarefas() {
        this.listaTarefas = new HashSet<>();
    }

    public void adicionarTarefa(String descricao){
        listaTarefas.add(new Tarefa(descricao));
    }
    public void removerTarefa(String descricao){
        Tarefa tarefaParaRemover = null;
        if(!listaTarefas.isEmpty()) {
            for (Tarefa t : listaTarefas)
                if (t.getDescricao().equalsIgnoreCase(descricao)) {
                    tarefaParaRemover = t;
                    break;
                }

            listaTarefas.remove(tarefaParaRemover);
        } else
            System.out.println("Set vazio.");

        if(tarefaParaRemover == null) {
            System.out.println("Tarefa não encontrada!");
        }
    }

    public void exibirTarefas(){
        if(!listaTarefas.isEmpty()) {
            System.out.println(listaTarefas);
        } else {
            System.out.println("Lista de tarefas vazia.");
        }
    }
    public int contarTarefas(){
        return listaTarefas.size();
    }
    public Set<Tarefa> obterTarefasConcluidas(){
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        if(!listaTarefas.isEmpty()){
            for(Tarefa t : listaTarefas)
                if(t.getConcluida())
                    tarefasConcluidas.add(t);

        } else
            System.out.println("Set vazio.");

        return tarefasConcluidas;
    }
    public Set<Tarefa> obterTarefasPendentes(){
        Set<Tarefa> tarefasPendentes = new HashSet<>();
        if(!listaTarefas.isEmpty()){
            for(Tarefa t : listaTarefas)
                if(!t.getConcluida())
                    tarefasPendentes.add(t);

        } else System.out.println("Set vazio.");

        return tarefasPendentes;
    }
    public void marcarTarefaConcluida(String descricao){
        for(Tarefa t : listaTarefas)
            if(t.getDescricao().equalsIgnoreCase(descricao)) {
                t.isConcluida(true);
                break;
            }
    }
    public void marcarTarefaPendente(String descricao){
        for(Tarefa t : listaTarefas)
            if(t.getDescricao().equalsIgnoreCase(descricao)) {
                t.isConcluida(false);
                break;
            }
    }
    public void limparListaTarefas(){
        Set<Tarefa> limparListaTarefas = new HashSet<>(listaTarefas);
        listaTarefas.removeAll(limparListaTarefas);
        //listaTarefas.clear();
    }


    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();

        // Adicionando tarefas na lista
        listaTarefas.adicionarTarefa("Passear com o cachorro");
        listaTarefas.adicionarTarefa("Retirar o lixo");
        listaTarefas.adicionarTarefa("Nadar com  peixe");
        listaTarefas.adicionarTarefa("Estudar Java");

        // Exibindo as tarefas na lista
        listaTarefas.exibirTarefas();

        // Removendo uma tarefa
        listaTarefas.removerTarefa("Passear com o cachorro");
        listaTarefas.exibirTarefas();

        // Contando o número de tarefas na lista
        System.out.println("Atualmente, temos : " + listaTarefas.contarTarefas() + " tarefas.");

        // Obtendo tarefas pendentes
        System.out.println("Lista de tarefas pendentes: " + listaTarefas.obterTarefasPendentes());

        // Marcando tarefas como concluídas
        listaTarefas.marcarTarefaConcluida("Estudar Java");
        listaTarefas.marcarTarefaConcluida("Nadar com  peixe");

        // Obtendo tarefas concluídas
        System.out.println("Tarefas concluídas: " + listaTarefas.obterTarefasConcluidas());

        // Marcando tarefas como pendentes
        listaTarefas.marcarTarefaPendente("Estudar Java");
        listaTarefas.exibirTarefas();

        // Limpando a lista de tarefas
        listaTarefas.limparListaTarefas();
        listaTarefas.exibirTarefas();

    }
}
