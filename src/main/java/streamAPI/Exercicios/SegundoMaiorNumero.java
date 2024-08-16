package main.java.streamAPI.Exercicios;

import java.util.Arrays;
import java.util.List;

/*
Desafio 7 - Encontrar o segundo número maior da lista:
Com a ajuda da Stream API, encontre o segundo número maior da lista e
exiba o resultado no console.
*/

public class SegundoMaiorNumero {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8,
                9, 10, 5, 4, 3);

        List<Integer> listaNumerosCrescente =
                numeros.stream()
                        .sorted()
                            .toList();

        listaNumerosCrescente.stream()
                .skip(listaNumerosCrescente.size() - 2).forEach(System.out::println);

    }
}
