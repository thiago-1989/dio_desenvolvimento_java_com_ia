package edu.thiago.desafios_stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MaiorNumeroPrimo {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3, 11, 15);

        // Encontrar o maior número primo na lista
        Optional<Integer> maiorPrimo = numeros.stream()
                .filter(MaiorNumeroPrimo::isPrimo)
                .max(Integer::compare);

        // Imprimir o resultado
        if (maiorPrimo.isPresent()) {
            System.out.println("O maior número primo é: " + maiorPrimo.get());
        } else {
            System.out.println("Não há números primos na lista.");
        }
    }
    private static boolean isPrimo(int n) {
        if (n <= 1) return false; // Números menores ou iguais a 1 não são primos
        if (n == 2) return true;  // 2 é o único número primo par
        if (n % 2 == 0) return false; // Outros números pares não são primos

        // Verifica divisores ímpares a partir de 3 até √n
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) {
                return false; // Encontrou um divisor
            }
        }
        return true;
    }
}