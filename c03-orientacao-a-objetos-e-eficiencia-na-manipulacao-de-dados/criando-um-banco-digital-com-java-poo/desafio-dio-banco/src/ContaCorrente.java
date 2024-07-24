
public class ContaCorrente extends Conta {


    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void extrato() {
        System.out.println("\n=== Extrato da Conta Corrente ===");
        super.infoExtrato();
    }

    public void saldo() {
        System.out.println("=== Saldo do Conta Corrente ===");
        super.infoSaldo();
    }

    public void dadosCliente() {
        super.infoCliente();
    }
}
