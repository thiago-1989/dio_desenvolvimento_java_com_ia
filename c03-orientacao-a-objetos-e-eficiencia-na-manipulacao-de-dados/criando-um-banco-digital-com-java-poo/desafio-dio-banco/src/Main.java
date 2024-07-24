import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Cliente thiago = new Cliente();
        thiago.setNome("Thiago");
        IConta cc = new ContaCorrente(thiago);
        Conta cp = new ContaPoupanca(thiago);

        cc.depositar(100);
        cp.transferir(10, cc);
        cc.transferir(50, cp);

        cc.extrato();
        cp.extrato();


    }
}