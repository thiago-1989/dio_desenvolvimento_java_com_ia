package edu.thiago.desafios_stream_api;

import java.util.Arrays;
import java.util.List;

public class Intervalo {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        List<Integer> intervalo5a8 = numeros.subList(4, 8);
        System.out.println(intervalo5a8);
    }
}
