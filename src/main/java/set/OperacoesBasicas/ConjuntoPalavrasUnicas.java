package main.java.set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    private Set<String> conjuntoPalavrasUnicas;

    public ConjuntoPalavrasUnicas() {
        this.conjuntoPalavrasUnicas = new HashSet<>();
    }

    public void adicionarPalavra(String palavra){
        conjuntoPalavrasUnicas.add(palavra);
    }
    public void removerPalavra(String palavra){
        if(!conjuntoPalavrasUnicas.isEmpty()) {
            if (conjuntoPalavrasUnicas.contains(palavra))
                conjuntoPalavrasUnicas.remove(palavra);
            else
                System.out.println("Palavra não encontrada");
        } else
            System.out.println("O conjunto está vazio, não há o que remover!");
    }
    public boolean verificarPalavra(String palavra){
        return conjuntoPalavrasUnicas.contains(palavra);

    }
    public void exibirPalavrasUnicas(){
        if(!conjuntoPalavrasUnicas.isEmpty()) {
            System.out.println(conjuntoPalavrasUnicas);
        } else {
            System.out.println("O conjunto está vazio!");
        }
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas cpu = new ConjuntoPalavrasUnicas();

        cpu.adicionarPalavra("Salamaleico");
        cpu.adicionarPalavra("Céu");
        cpu.adicionarPalavra("Brisa");
        cpu.adicionarPalavra("Onda");
        cpu.adicionarPalavra("Céu");

        cpu.exibirPalavrasUnicas();

        if(cpu.verificarPalavra("Salamaleico"))
            System.out.println("A palavra Salamaleico está no Set");
        else
            System.out.println("A palavra Salamaleico não está no Set.");

        cpu.removerPalavra("Salamaleico");
        cpu.exibirPalavrasUnicas();

        if(cpu.verificarPalavra("Salamaleico"))
            System.out.println("A palavra Salamaleico está no Set");
        else
            System.out.println("A palavra Salamaleico não está no Set.");

    }

}
