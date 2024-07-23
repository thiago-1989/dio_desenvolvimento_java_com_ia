package edu.thiago.desafios_stream_api;

import java.util.Arrays;
import java.util.List;

public class SeMaiorQueDez {

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        boolean maiorQueDez = numeros.stream().max(Integer::compareTo).get() > 10;

        if (maiorQueDez) {
            System.out.println("Existe numero maior que dez");
        } else {
            System.out.println("Não existe numero maior que dez");
        }

    }
}
