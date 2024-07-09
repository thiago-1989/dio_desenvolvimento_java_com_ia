package edu.thiago;

public class A03Incremento {
    public static void main(String[] args) {
        int numero = 5;
        System.out.println(numero); // 5

        // Incremento
        numero = numero + 1;
        System.out.println(numero); // 6
            // ou
        numero += 1;
        System.out.println(numero); // 7
            // ou
        numero++; // Caso sseja incremento de 1
        System.out.println(numero); // 8

        System.out.println(numero++); // 8 "colocando ++ na frente da variável primeiro será impresso e depois incrementado"
        System.out.println(numero); // 9 
        System.out.println(++numero); // 10 "Nesse casso incrementamos primeiro e depois mostramos o valor"

        // Também é possível incrementar valores maiores que 1 como no exemplo abaixo;

        numero = 2;
        numero = numero + 3;
        System.out.println(numero);
            // ou
        numero += 2;
        System.out.println(numero);

        numero += 3;
        System.out.println(numero);
    }
}
