package main.java.streamAPI.Exercicios;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

/*
Desafio 5 - Calcule a média dos números maiores que 5:
Com a Stream API, calcule a média dos números maiores
 que 5 e exiba o resultado no console.
*/

public class MediaNumerosMaioresQueCinco {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6,
                7, 8, 9, 10, 10, 4, 3);

/*
        Predicate<Integer> verificadorMaiorQueCinco = n -> n > 5;

        List<Integer> listaNumerosMaioresQueCinco =
                numeros.stream()
                        .filter(n -> n > 5)
                        .toList();

       BinaryOperator<Integer> somar = (n1, n2) -> n1 + n2;

        double resultadoSoma = listaNumerosMaioresQueCinco.stream()
                .reduce(0, (n1, n2) -> n1 + n2);

        double media = resultadoSoma / listaNumerosMaioresQueCinco.size();

                System.out.println("A média dos números maiores que 5 da lista é: "
                + media);

*/

        numeros.stream()
                        .filter(n -> n > 5)
                                .mapToInt(n -> n)
                                        .average()
                                                .ifPresent(n ->
                                                        System.out.println("A média " +
                                                                "dos números maiores que 5 é: " + n));


    }
}
