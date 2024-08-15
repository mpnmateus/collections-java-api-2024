package main.java.streamAPI.Exercicios;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/*
Com a ajuda da Stream API, verifique se todos os
números da lista são positivos e exiba o resultado no console.
*/


public class VerificaTodosNumerosPositivos {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, -7,
                8, 9, 10, 5, 4, 3);

        Predicate<Integer> verificarNumerosPositivos = n -> n >= 0;

        List<Integer> listaNumerosPositivos = numeros.stream()
                .filter(verificarNumerosPositivos)
                .collect(Collectors.toList());

        if(listaNumerosPositivos.size() == numeros.size())
            System.out.println("Todos os números da lista 'numeros' são positivos");
        else
            System.out.println("Nem todos os números da lista 'numeros' são positivos.");
    }
}
