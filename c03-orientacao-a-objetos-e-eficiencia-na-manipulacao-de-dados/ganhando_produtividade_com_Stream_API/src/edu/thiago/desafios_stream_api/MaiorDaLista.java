package edu.thiago.desafios_stream_api;

import java.util.Arrays;
import java.util.List;

public class MaiorDaLista {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        System.out.print("O maior número da lista é ");
        numeros.stream().max(Integer::compareTo).ifPresent(System.out::println);
    }
}
