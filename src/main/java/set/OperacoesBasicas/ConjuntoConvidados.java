package main.java.set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidado> convidados;

    public ConjuntoConvidados(){
        this.convidados = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite){
        convidados.add(new Convidado(nome, codigoConvite));
    }
    public void removerConvidadoPorCodigoConvite(int codigoConvite){
        Convidado convidadoParaRemover = null;
        if(!convidados.isEmpty()){
            for(Convidado c : convidados)
                if(c.getCodConvite() == codigoConvite) {
                    convidadoParaRemover = c;
                    break;
                }
            convidados.remove(convidadoParaRemover);
        } else
            throw new RuntimeException("O conjunto está vazio.");
    }

    public int contarConvidados(){
        if(!convidados.isEmpty())
            return convidados.size();
        else
            throw new RuntimeException("Sem convidados no conjunto");
    }
    public Set<Convidado> exibirConvidados(){
        if(!convidados.isEmpty())
            return convidados;
        else
            throw new RuntimeException("Sem convidados no conjunto");
    }

    public static void main(String[] args) {
        ConjuntoConvidados c = new ConjuntoConvidados();

        c.adicionarConvidado("Mateus", 1234);
        c.adicionarConvidado("Maria", 1235);
        c.adicionarConvidado("Josué", 1235);
        c.adicionarConvidado("Carlota", 1236);

        System.out.println(c.exibirConvidados());

        System.out.println("Existem " + c.contarConvidados() + " convidado(s) dentro do Set.");

        c.removerConvidadoPorCodigoConvite(1234);
        System.out.println("Existem " + c.contarConvidados() + " convidado(s) dentro do Set.");


        System.out.println(c.exibirConvidados());

        System.out.println("Existem " + c.contarConvidados() + " convidado(s) dentro do Set.");

    }
}
