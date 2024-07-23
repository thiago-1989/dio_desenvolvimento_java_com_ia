package edu.thiago.desafios_stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SomarLista {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Soma todos os dígitos dos números na lista
        int somaDosDigitos = numeros.stream() // Cria um fluxo de números inteiros
                .flatMapToInt(numero ->
                        String.valueOf(numero) // Converte o número para String
                                .chars() // Obtém um fluxo de códigos Unicode dos caracteres
                                .map(Character::getNumericValue) // Converte os códigos Unicode para valores numéricos dos dígitos
                )
                .sum(); // Soma todos os valores numéricos dos dígitos
        System.out.println(somaDosDigitos);
    }
}

/*
* package edu.thiago.desafios_stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SomarLista {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        Optional<Integer> resultado = numeros.stream() // O método stream() transforma a lista em um fluxo de elementos que pode ser manipulado
                .reduce(Integer::sum);// Usa o método reduce para agregar os elementos do fluxo
                                    // O reduce é uma operação de redução que aplica uma função binária acumulativa
                                     // Neste caso, Integer::sum é uma referência ao método que soma dois inteiros
        System.out.println(resultado.get());
    }
}
*/