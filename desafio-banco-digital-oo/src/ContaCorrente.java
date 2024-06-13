public class ContaCorrente extends Conta {

    private static final double TAXA_MANUTENCAO = 10.0;

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            registrarTransacao(TipoTransacao.SAQUE, valor);
        } else {
            System.out.println("Saldo insuficiente para saque de R$" + valor);
        }
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Corrente ===");
        super.imprimirExtrato(); 
        System.out.println("Taxa de manutenção: R$" + TAXA_MANUTENCAO);
    }
}
