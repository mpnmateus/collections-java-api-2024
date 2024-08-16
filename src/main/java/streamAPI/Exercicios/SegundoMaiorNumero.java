package main.java.streamAPI.Exercicios;

import java.util.Arrays;
import java.util.Comparator;
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

        List<Integer> segundoMaior =
                numeros.stream()
                        .distinct() // Remove duplicatas
                        .sorted((n1, n2) -> n2 - n1) // Ordena em ordem decrescente
                        .skip(1) // Pular o maior número
                        .limit(1) // Limitar a apenas um resultado
                        .toList(); // Coletar como lista

        // Exibir o resultado no console
        if (!segundoMaior.isEmpty()) {
            System.out.println("O segundo maior número é: " + segundoMaior.get(0));
        } else {
            System.out.println("Não há um segundo maior número na lista.");
        }



    }
}
