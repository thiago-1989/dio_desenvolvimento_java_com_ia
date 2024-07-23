package edu.thiago.desafios_stream_api;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class OrdemNumerica {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        numeros.stream().sorted(Comparator.naturalOrder()).forEach(System.out::println);
    }
}

/*
* package edu.thiago.desafios_stream_api;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class OrdemNumerica {
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

    public List<Integer> ordenar() {
        numeros.sort(Comparator.naturalOrder());
        return numeros;
    }

    public static void main(String[] args) {
        OrdemNumerica ordemNumerica = new OrdemNumerica();
        System.out.println(ordemNumerica.ordenar());

    }
}

*/
