package main.java.list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros implements Comparable<Integer>{
    List<Integer> listaNumerosInteiros;

    public OrdenacaoNumeros() {
        this.listaNumerosInteiros = new ArrayList<Integer>();
    }

    @Override
    public int compareTo(Integer outroNumero) {
        return Integer.compare(this.listaNumerosInteiros.get(0), outroNumero);
    }
    public void adicionarNumero(int numero){
        listaNumerosInteiros.add(numero);
    }

    public List<Integer> ordenarAscendente(){
        List<Integer> ordenaOrdemAscendente = new ArrayList(listaNumerosInteiros);
        if(!listaNumerosInteiros.isEmpty()){
            Collections.sort(ordenaOrdemAscendente);
            return ordenaOrdemAscendente;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }
    public List<Integer> ordenarDescendente() {
        List<Integer> numerosAscendente = new ArrayList<>(this.listaNumerosInteiros);
        if (!listaNumerosInteiros.isEmpty()) {
            numerosAscendente.sort(Collections.reverseOrder());
            return numerosAscendente;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public void exibirNumeros(){
        if(!listaNumerosInteiros.isEmpty())
            System.out.println(this.listaNumerosInteiros);
        else
            System.out.println("A lista está vazia!");
    }

    public List<Integer> getListaNumerosInteiros() {
        return listaNumerosInteiros;
    }

    @Override
    public String toString() {
        return "OrdenacaoNumeros{" +
                "listaNumerosInteiros=" + listaNumerosInteiros +
                '}';
    }

    public static void main(String[] args) {
        OrdenacaoNumeros ordenacaoNumeros = new OrdenacaoNumeros();

        ordenacaoNumeros.adicionarNumero(1);
        ordenacaoNumeros.adicionarNumero(5);
        ordenacaoNumeros.adicionarNumero(66);
        ordenacaoNumeros.adicionarNumero(2);
        ordenacaoNumeros.adicionarNumero(22);
        ordenacaoNumeros.adicionarNumero(2);

        ordenacaoNumeros.exibirNumeros();

        System.out.println("Ordenando de forma ascendente: " + ordenacaoNumeros.ordenarAscendente());

        ordenacaoNumeros.exibirNumeros();

        System.out.println("Ordenando de forma ascendente: " + ordenacaoNumeros.ordenarDescendente());

        ordenacaoNumeros.exibirNumeros();
    }
}
