package Default;

public class main {

    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setNome("Antonio");

        Conta cc = new ContaCorrente(cliente);
        Conta cp = new ContaPolpanca(cliente);

        cc.depositar(100);
        cc.transferir(50, cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
}
