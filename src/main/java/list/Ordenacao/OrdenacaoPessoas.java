package main.java.list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {
    List<Pessoa> listaPessoas;

    public OrdenacaoPessoas() {
        this.listaPessoas = new ArrayList<Pessoa>();
    }
    public void adicionarPessoa(String nome, int idade, double altura){
        listaPessoas.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> pessoasPorIdade = new ArrayList<>(listaPessoas);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }
    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> pessoasPorAltura = new ArrayList<> (listaPessoas);
        Collections.sort(pessoasPorAltura, new comparatorPorAltura());
        return pessoasPorAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoas ordernacaoPessoa = new OrdenacaoPessoas();

        ordernacaoPessoa.adicionarPessoa("Mateus", 33, 1.73);
        ordernacaoPessoa.adicionarPessoa("João", 28, 1.80);
        ordernacaoPessoa.adicionarPessoa("Violeta", 40, 1.90);
        ordernacaoPessoa.adicionarPessoa("Marcos", 5, 0.5);
        ordernacaoPessoa.adicionarPessoa("Violeta", 80, 1.50);

        System.out.println("A lista da pessoas é: " + ordernacaoPessoa.listaPessoas);

        System.out.println("Ordenando por altura: " + ordernacaoPessoa.ordenarPorAltura());

        System.out.println("Ordenando por idade: " + ordernacaoPessoa.ordenarPorIdade());

    }
}
