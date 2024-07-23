package edu.thiago.desafios_stream_api;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class SegundoMaiorDaLista {

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Optional<Integer> segundoMaior = numeros.stream().distinct() // Remove duplicatas
                .sorted(Comparator.reverseOrder()) // Ordena em ordem decrescente
                .skip(1) // Pula o maior número
                .findFirst(); // Pega o próximo número (segundo maior)

        System.out.println(segundoMaior);
    }
}