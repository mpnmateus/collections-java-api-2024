package main.java.streamAPI.Exercicios;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/*
Utilize a Stream API para remover os
valores ímpares da lista e imprima a lista resultante no console.
*/

public class RemoveTodosNumerosImpares {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6,
                7, 8, 9, 10, 5, 4, 3);

        Predicate<Integer> verificaNumerosImpares = n -> n % 2 == 0;

        List<Integer> listaNumerosPares = numeros.stream()
                .filter(verificaNumerosImpares)
                .collect(Collectors.toList());

        System.out.println(listaNumerosPares);

    }
}
