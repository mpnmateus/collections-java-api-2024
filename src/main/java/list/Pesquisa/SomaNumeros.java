package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    List<Integer> listaNumerosInteiros;

    //construtor
    public SomaNumeros(){
        this.listaNumerosInteiros = new ArrayList<Integer>();
    }

    public void adicionarNumero(int numero){
        listaNumerosInteiros.add(numero);
    }
    public int calcularSoma(){
        int acumulaParaSoma = 0;
        if(!listaNumerosInteiros.isEmpty())
            for(Integer numero : listaNumerosInteiros)
                acumulaParaSoma += numero;
        return acumulaParaSoma;
    }
    public int encontrarMaiorNumero(){
        int maiorValor = Integer.MIN_VALUE;
        if(!listaNumerosInteiros.isEmpty()) {
            for (Integer numero : listaNumerosInteiros)
                if (numero > maiorValor)
                    maiorValor = numero;
            return maiorValor;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }
    public int encontrarMenorNumero(){
        int menorValor = Integer.MAX_VALUE;
        if(!listaNumerosInteiros.isEmpty()) {
            for (Integer numero : listaNumerosInteiros)
                if (numero < menorValor)
                    menorValor = numero;
            return menorValor;
        } else {
            throw new RuntimeException("A lista está vazia");
        }
    }

    public List<Integer> exibirNumeros(){
        if(!listaNumerosInteiros.isEmpty())
            return listaNumerosInteiros;
        else
            throw new RuntimeException("xxxx");
    }

    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();

        somaNumeros.adicionarNumero(5);
        somaNumeros.adicionarNumero(10);
        somaNumeros.adicionarNumero(20);

        System.out.println("A lista dos números é: " + somaNumeros.exibirNumeros());

        System.out.println("A soma dos numeros é: " + somaNumeros.calcularSoma());

        System.out.println("O maior valor da lista é: " + somaNumeros.encontrarMaiorNumero());

        System.out.println("O menor valor é: " + somaNumeros.encontrarMenorNumero());
    }

}
