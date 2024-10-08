package main.java.streamAPI.Exercicios;

import java.util.Arrays;
import java.util.List;


/*
Desafio 6 - Verificar se a lista contém algum número maior que 10:
Utilize a Stream API para verificar se a lista contém algum número maior que
10 e exiba o resultado no console.
*/

public class ContemNumMaiorQueDez {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 80, 9, 10, 5, 4, 25);

        numeros.stream()
            .filter(n -> n > 10)
                .forEach(n -> System.out.println(n));
    }
}
