package main.java.streamAPI.Exercicios;

/*
Desafio 2 - Imprima a soma dos números pares da lista:
Utilizando a Stream API, realize a soma
dos números pares da lista e exiba o resultado no console.
*/

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class SomaNumerosPares {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4,
                5, 6, 7, 8, 9, 10, 5, 4, 3);

        Predicate<Integer> numeroPar = n -> n % 2 == 0;

        List<Integer> listaNumerosPares = numeros.stream()
                        .filter(numeroPar)
                                .collect(Collectors.toList());

        BinaryOperator<Integer> somar = (num1, num2) -> num1 + num2;

        int resultado = listaNumerosPares.stream()
                .reduce(0, somar);

        System.out.println("A soma dos números é: " + resultado);

    }
}
