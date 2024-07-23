package edu.thiago.desafios_stream_api;

import java.util.Arrays;
import java.util.List;

public class SeSaoPositivos {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        boolean todosPositivos = numeros.stream().allMatch(numero -> numero > 0);
        if (todosPositivos) {
            System.out.println("São todos positivos");
        } else {
            System.out.println("Não são todos positivos");
        }
    }
}
