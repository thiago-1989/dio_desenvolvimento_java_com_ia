import java.util.concurrent.ThreadLocalRandom;

public class While {

    private static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2, 8);
       }

    public static void main(String[] args) {
        double mesada = 50.0;
        double valorDoce;
        double carrinho = 0;
        while (mesada > 0) {
            valorDoce = valorAleatorio();
            if (valorDoce > mesada) {
                valorDoce = mesada;
            }
            System.out.println("Doce de valor R$" + valorDoce + " Adicionado ao carrinho");
            mesada = mesada - valorDoce;
            carrinho += valorDoce;
        }
        System.out.println("Carrinho: R$" + carrinho);
        System.out.println("Mesada:" + mesada);
        System.out.println("Joãozinho gastou toda a sua mesada em doces");
    
    }
}
