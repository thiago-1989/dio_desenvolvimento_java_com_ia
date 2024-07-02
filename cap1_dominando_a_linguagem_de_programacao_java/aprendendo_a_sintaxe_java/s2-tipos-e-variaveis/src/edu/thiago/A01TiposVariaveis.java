package  edu.thiago;

public class A01TiposVariaveis {
    public static void main(String[] args) {
        double salarioMinimo = 2500.00;
        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
     // short numeroCurto2 = numeroNormal; // Dispara uma excecssão
        short numeroCurto2 = (short) numeroNormal; // essa é a forma de corrigir esse erro reforçando o tipo pois possua capacidade menor do que o tipo atribuído
        System.out.println(numeroCurto2 + ": " + salarioMinimo);
    }
}