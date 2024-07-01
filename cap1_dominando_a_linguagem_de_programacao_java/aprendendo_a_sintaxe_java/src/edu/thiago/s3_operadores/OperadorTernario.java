package edu.thiago.s3_operadores;

public class OperadorTernario {
    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        // estrutura dos operadores ternários  "<proposição> ? <Se verdadeiro> : <Se falso>; "
        String resultado = a == b ? "Verdadeiro" : "Falso";
        System.out.println(resultado);

        resultado = a < b ? "Verdadeiro" : "Falso";
        System.out.println(resultado);

        int novoResultado = a > b ? 1 : 0;
        System.out.println(novoResultado);
    }
}
