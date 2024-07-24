package edu.thiago.desafios_stream_api;

import java.util.Arrays;
import java.util.List;

public class SomaDosQuadrados {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int soma = 0;

        int somaQuadrados = numeros.stream().map(n -> n * n).reduce(soma, Integer::sum);

        System.out.println(somaQuadrados);
    }
}
