package edu.thiago.desafios_stream_api;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MultiplosDe3ou5 {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Set<Integer> semRepetir = new HashSet<>(numeros);

        List<Integer> multiplosDe3ou5 = semRepetir.stream().filter(n -> n % 3 == 0 || n % 5 == 0 ).toList();

        System.out.println(multiplosDe3ou5);

    }
}
