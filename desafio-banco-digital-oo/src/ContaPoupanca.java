
public class ContaPoupanca extends Conta {

    private static final double TAXA_RENDIMENTO = 0.5; // Exemplo: 0.5% ao mês

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Poupança ===");
        super.imprimirInfosComuns();
        System.out.println("Taxa de rendimento: " + TAXA_RENDIMENTO + "% ao mês");
        super.imprimirExtrato();
    }
}
