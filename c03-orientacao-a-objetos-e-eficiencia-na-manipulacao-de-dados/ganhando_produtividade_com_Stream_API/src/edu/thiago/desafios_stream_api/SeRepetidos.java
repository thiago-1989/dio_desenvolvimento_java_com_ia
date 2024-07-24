package edu.thiago.desafios_stream_api;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class SeRepetidos {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        boolean temRepetidos = new HashSet<>(numeros).size() < numeros.size();
        if (temRepetidos) {
            System.out.println("Contém números repetidos");
        } else {
            System.out.println("Não contém repetidos");
        }
    }
}
