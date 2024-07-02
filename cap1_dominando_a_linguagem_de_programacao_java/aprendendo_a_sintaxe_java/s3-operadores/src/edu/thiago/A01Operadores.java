package edu.thiago;

public class A01Operadores {
    public static void main(String[] args) {
        int numero = 5;
        System.out.println(- numero); // -5
        System.out.println(numero); // 5
        
        numero = - numero;
        System.out.println(numero); // -5

        numero = + numero;  
        System.out.println(numero); // -5  Dessa forma ñ conseguimos converter a positivo novamente

        numero = numero * -1; // Assim como na matemática convertemos um negativo para positivo multiplicando por -1
        System.out.println(numero);

        
    }
}
