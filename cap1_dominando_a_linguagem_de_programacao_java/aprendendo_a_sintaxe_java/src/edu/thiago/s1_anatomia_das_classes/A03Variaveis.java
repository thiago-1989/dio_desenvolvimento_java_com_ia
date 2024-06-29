package edu.thiago.s1_anatomia_das_classes;

public class A03Variaveis {
    public static void main(String[] args) {
        /* Variáveis */
        int ano = 2023;
        System.out.println(ano);
        ano = 2024;
        System.out.println(ano);

        String diaSemana= "Quarta-feira";
        System.out.println(diaSemana);
        diaSemana = "Sábado";
        System.out.println(diaSemana);

        /* Constantes */
        final String PAIS = "Brasil";
        System.out.println(PAIS);
        /*
        BR = "Japão"
        System.out.println(PAIS);
        System.out.print("Olá, " + PAIS + "! Sejam todos bem-vindos");
        */

        boolean casado = true; // recebe valores booleanos "true" ou "false" apenas
        System.out.println(casado);

    }
}
 