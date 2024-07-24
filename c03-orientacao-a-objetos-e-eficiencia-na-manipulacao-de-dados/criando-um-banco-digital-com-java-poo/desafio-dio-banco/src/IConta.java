public interface IConta {

    // métodos
    void sacar(double valor);

    void depositar(double valor);

    void transferir(double valor, IConta contaDestino);

    void extrato();

    void saldo();
}
