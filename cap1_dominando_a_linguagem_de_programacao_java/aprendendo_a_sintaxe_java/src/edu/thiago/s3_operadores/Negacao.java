package edu.thiago.s3_operadores;

public class Negacao {
    public static void main(String[] args) {
        boolean verdadeiroOuFalso = true;
        System.out.println(verdadeiroOuFalso); // true
        System.out.println(!verdadeiroOuFalso); // false
        System.out.println(verdadeiroOuFalso); // true
        
        // para inverter o valor da variável do tipo boolean é preciso reatribuir o novo valor

        verdadeiroOuFalso = !verdadeiroOuFalso;
        System.out.println(verdadeiroOuFalso);

    }

}
