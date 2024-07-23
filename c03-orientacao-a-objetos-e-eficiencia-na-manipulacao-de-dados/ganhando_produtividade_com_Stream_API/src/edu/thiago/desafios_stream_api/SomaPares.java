package edu.thiago.desafios_stream_api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SomaPares {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> pares = new ArrayList<>();

        for (Integer numero : numeros) {
            if (numero % 2 == 0) {
                pares.add(numero);
            }
        }
        System.out.println(pares.stream().reduce(0, Integer::sum));
    }
}
