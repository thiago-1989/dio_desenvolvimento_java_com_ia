package edu.thiago.s3_operadores;

public class Decremento {
    public static void main(String[] args) {
        int numero = 5;
        System.out.println(numero); // 5

        // Incremento
        numero = numero - 1;
        System.out.println(numero); // 4
            // ou
        numero -= 1;
        System.out.println(numero); // 3
            // ou
        numero--; // Caso sseja incremento de 1
        System.out.println(numero); // 2

        System.out.println(numero++); // 1 "colocando -- na frente da variável primeiro será impresso e depois decrementado"
        System.out.println(numero); // 0
        
        numero = 10;
        System.out.println(--numero); // 9 "Nesse casso decrementamos primeiro e depois mostramos o valor"

        // Também é possível decrementar valores maiores que 1 como no exemplo abaixo;

        numero = numero - 2;
        System.out.println(numero); // 7
            // ou
        numero -= 2;
        System.out.println(numero); // 5

        numero -= 3;
        System.out.println(numero); // 2
    
        // além disso podemos usar a divião e multiplicação

        numero = 10;
        numero *= 2; // numero = numero * 2 == 20
        System.out.println(numero); // 20

        numero /= 5; // numero = numero / 5 == 4
        System.err.println(numero); // 4
    }
}
