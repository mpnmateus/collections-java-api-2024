package main.java.streamAPI.Exercicios;

/*
Utilizando a Stream API, realize a soma
dos números pares da lista e exiba o resultado no console.
*/

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class SomaNumerosPares {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4,
                5, 6, 7, 8, 9, 10, 5, 4, 3);

        Predicate<Integer> numeroPar = n -> n % 2 == 0;

        numeros.stream()
                .filter(numeroPar)
                .forEach(s -> System.out.println(s));

    }
}
