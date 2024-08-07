package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
    private List<Tarefa> listaTarefas;

    public ListaTarefas(){
        listaTarefas = new ArrayList();
    }
    public void adicionarTarefa(String descricao){
        listaTarefas.add(new Tarefa(descricao));
    }
    public void removerTarefa(String descricao){
        List<Tarefa> tarefasParaRemover = new ArrayList();
        for(Tarefa t : listaTarefas)
            if(t.getDescricao().equalsIgnoreCase(descricao))
                tarefasParaRemover.add(t);
        listaTarefas.removeAll(tarefasParaRemover);
    }
    public int obterNumeroTotalTarefas(){
        return listaTarefas.size();
    }
    public void obterDescricoesTarefas(){
        System.out.println("Lista de tarefas: \n" + listaTarefas);
    }

    public static void main(String[] args) {
        //Instanciando um objeto do tipo ListaTarefas
        //Ao instanciar o objeto ListaTarefas, criamos um objeto ArrayList que recebe elementos do tipo Tarefa (que possui o atributo descricao)
        ListaTarefas listaTarefas = new ListaTarefas();

        //Adicionando tarefas à lista
        listaTarefas.adicionarTarefa("Correr com o cachorro");
        listaTarefas.adicionarTarefa("Tirar o lixo");
        listaTarefas.adicionarTarefa("Estudar Java");

        //Exibindo o número total de tarefas na lista
        System.out.println("O número total de tarefas ate o momento é: " + listaTarefas.obterNumeroTotalTarefas());

        //Exibindo descrições das tarefas na lista
        listaTarefas.obterDescricoesTarefas();

        //Removendo uma tarefa da lista
        listaTarefas.removerTarefa("Trabalhar");


        //Exibindo o número total de tarefas na lista
        System.out.println("O número total de tarefas ate o momento é: " + listaTarefas.obterNumeroTotalTarefas());

        //Removendo uma tarefa da lista
        listaTarefas.removerTarefa("Correr com o CACHORRO");

        //Exibindo o número total de tarefas na lista
        System.out.println("Agora você tem " + listaTarefas.obterNumeroTotalTarefas() + " tarefas.");



    }

}


