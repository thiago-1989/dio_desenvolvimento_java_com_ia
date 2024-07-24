
public class ContaPoupanca extends Conta {


    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    public void extrato() {
        System.out.println("\n=== Extrato da Conta Poupança ===");
        super.infoExtrato();
    }

    public void saldo() {
        System.out.println("=== Saldo do Conta Poupança ===");
        super.infoSaldo();
    }

    public void dadosCliente() {
        super.infoCliente();
    }

}
