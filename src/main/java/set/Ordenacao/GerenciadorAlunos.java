package main.java.set.Ordenacao;

import com.sun.security.jgss.GSSUtil;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    private Set<Aluno> alunosSet;

    public GerenciadorAlunos() {
        this.alunosSet = new HashSet<>();
    }
    public void adicionarAluno(String nome, Long matricula, double nota){
        alunosSet.add(new Aluno(nome, matricula, nota));
    }
    public void removerAlunoPorMatricula(long matricula){
        Aluno alunoParaRemover = null;
        if(!alunosSet.isEmpty()){
            for(Aluno a : alunosSet)
                if(a.getMatricula() == matricula) {
                    alunoParaRemover = a;
                    break;
                }
            alunosSet.remove(alunoParaRemover);
        } else System.out.println("Sem alunos no Set.");
        if(alunoParaRemover == null)
            System.out.println("Matrícula não encontrada");
    }
    public void exibirAlunosPorNome(){
        Set<Aluno> alunosPorNome = new TreeSet<>(alunosSet);
        if (!alunosSet.isEmpty()) {
            System.out.println(alunosPorNome);
        } else {
            System.out.println("O conjunto está vazio!");
        }
    }

    public Set<Aluno> exibirAlunosPorNota(){
        Set<Aluno> alunosPorNota = new TreeSet<>(new ComparatorAlunoPorNota());
        alunosPorNota.addAll(alunosSet);
        return alunosPorNota;
    }
    public void exibirAlunos(){
        if(!alunosSet.isEmpty())
            System.out.println(alunosSet);
        else
            System.out.println("O conjunto está vazio");
    }

    public static void main(String[] args) {
        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();

        gerenciadorAlunos.adicionarAluno("João", 123456L, 7.5);
        gerenciadorAlunos.adicionarAluno("Maria", 123457L, 9.0);
        gerenciadorAlunos.adicionarAluno("Carlos", 123457L, 5.0);
        gerenciadorAlunos.adicionarAluno("Ana", 123459L, 6.8);
        gerenciadorAlunos.adicionarAluno("Zacarias", 123460L, 1.8);

        // Exibindo todos os alunos no gerenciador
        System.out.println("Alunos no gerenciador:");
        System.out.println(gerenciadorAlunos.alunosSet);

        // Removendo um aluno com matrícula inválida e outro pelo número de matrícula
        gerenciadorAlunos.removerAlunoPorMatricula(000L);
        gerenciadorAlunos.removerAlunoPorMatricula(123457L);
        System.out.println(gerenciadorAlunos.alunosSet);

        // Exibindo alunos ordenados por nome
        gerenciadorAlunos.exibirAlunosPorNome();

        // Exibindo alunos ordenados por nota
        System.out.println(gerenciadorAlunos.exibirAlunosPorNota());
    }

}
