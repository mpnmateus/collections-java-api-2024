package main.java.streamAPI.Exercicios;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

/*
Crie um programa que utilize a Stream API para
ordenar a lista de números em ordem crescente e a exiba
no console.
*/

public class OrdenarOrdemCrescente {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8,
                9, 10, 5, 4, 3);

        numeros.stream()
                .sorted(Comparator.naturalOrder())
                .forEach(s -> System.out.println(s));
    }

}
