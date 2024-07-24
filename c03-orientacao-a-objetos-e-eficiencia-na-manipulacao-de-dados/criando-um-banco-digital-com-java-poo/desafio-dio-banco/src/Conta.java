public abstract class Conta implements IConta {

    private static int AGENCIA_PADRAO = 0001;
    private static int SEQUENCIAL = 1;

    protected Cliente cliente;
    protected int agencia;
    protected int numero;
    protected double saldo;


    public Conta(Cliente cliente) {
        this.cliente = cliente;
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
    }

    @Override
    public void sacar(double valor) {
        saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void transferir (double valor, IConta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    // Getters
    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    protected void infoExtrato() {
        System.out.printf("Titular: %s\n", this.cliente.getNome());
        System.out.printf("Agência: %d\n", agencia);
        System.out.printf("Conta: %d\n", numero);
        System.out.printf("Saldo: %.2f\n", saldo);
    }

    protected void infoSaldo() {
        System.out.printf("Titular: %s\n", this.cliente.getNome());
        System.out.printf("Saldo: %.2f\n", saldo);
    }

    protected void infoCliente() {
        System.out.printf("Titular: %s\n", this.cliente.getNome());
    }

}
