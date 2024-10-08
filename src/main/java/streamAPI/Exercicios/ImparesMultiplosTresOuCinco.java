package main.java.streamAPI.Exercicios;

import java.util.Arrays;
import java.util.List;

/*
Desafio 10 - Agrupe os valores ímpares múltiplos de 3 ou de 5:
Utilize a Stream API para agrupar os valores ímpares múltiplos de 3 ou de 5 e exiba o resultado no console.
*/

public class ImparesMultiplosTresOuCinco {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5,
                6, 7, 8, 9, 10, 5, 4, 3);

//        List<Integer> MultTresOuCinco =
//                numeros.stream()
//                        .filter(n -> (n % 3 == 0 || n % 5 == 0))
//                        .distinct()
//                        .sorted()
//                        .toList();
//        System.out.println(MultTresOuCinco);


        List<Integer> numerosImpares =
                numeros.stream()
                    .filter(n -> n % 2 != 0)
                    .distinct() // Remove duplicatas
                    .sorted() // Ordena em ordem crescente
                    .toList();

        // Exibe os numeros impares multiplos de tres ou cinco
        numerosImpares.stream()
                .filter(n -> (n % 3 == 0 || n % 5 == 0)) // Filtra com base em um predicado (usando Lambda)
                .forEach(n -> System.out.println(n)); // Executa uma ação para cada elemento da stream
    }

}
