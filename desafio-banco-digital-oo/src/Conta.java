import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public abstract class Conta implements IConta {

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;
    protected List<Transacao> historicoTransacoes;

    public Conta(Cliente cliente) {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
        this.historicoTransacoes = new ArrayList<>();
    }

    @Override
    public void sacar(double valor) {
        this.saldo -= valor;
        registrarTransacao(TipoTransacao.SAQUE, valor);
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
        registrarTransacao(TipoTransacao.DEPOSITO, valor);
    }

    @Override
    public void transferir(double valor, IConta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
        registrarTransacao(TipoTransacao.TRANSFERENCIA, valor);
    }

    protected void registrarTransacao(TipoTransacao tipo, double valor) {
        Transacao transacao = new Transacao(LocalDateTime.now(), tipo, valor);
        this.historicoTransacoes.add(transacao);
    }

    public void imprimirExtrato() {
        System.out.println("=== Extrato da Conta ===");
        imprimirInfosComuns();
        System.out.println("=== Histórico de Transações ===");
        for (Transacao transacao : historicoTransacoes) {
            System.out.println(transacao);
        }
    }

    protected void imprimirInfosComuns() {
        System.out.println("Titular: " + cliente.getNome());
        System.out.println("Agência: " + agencia);
        System.out.println("Número: " + numero);
        System.out.println("Saldo: R$" + saldo);
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }
}
