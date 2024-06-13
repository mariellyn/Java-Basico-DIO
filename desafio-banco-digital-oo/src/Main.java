public class Main {

    public static void main(String[] args) {
        Cliente mari = new Cliente("Mari");

        ContaCorrente cc = new ContaCorrente(mari);
        ContaPoupanca poupanca = new ContaPoupanca(mari);

        cc.depositar(1000);
        poupanca.depositar(500);

        cc.sacar(200);
        cc.transferir(300, poupanca);

        cc.imprimirExtrato();
        System.out.println("--------------------");
        poupanca.imprimirExtrato();
    }
}
