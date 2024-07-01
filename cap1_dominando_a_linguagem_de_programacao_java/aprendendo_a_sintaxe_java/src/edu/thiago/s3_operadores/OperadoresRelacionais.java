package edu.thiago.s3_operadores;

public class OperadoresRelacionais {
    public static void main(String[] args) {
        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;
        System.out.println(simNao); // false

        simNao = numero1 != numero2;
        System.out.println(simNao); // true
        
        simNao = numero1 > numero2;
        System.out.println(simNao); // false 

        simNao = numero1 < numero2;
        System.out.println(simNao); // true

        String nome1 = "Thiago";
        String nome2 = new String("Thiago");
        System.out.println(nome1 == nome2);
    }

}
