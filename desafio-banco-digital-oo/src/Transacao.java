import java.time.LocalDateTime;

public class Transacao {

    private LocalDateTime dataHora;
    private TipoTransacao tipo;
    private double valor;

    public Transacao(LocalDateTime dataHora, TipoTransacao tipo, double valor) {
        this.dataHora = dataHora;
        this.tipo = tipo;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Transacao{" +
                "dataHora=" + dataHora +
                ", tipo=" + tipo +
                ", valor=" + valor +
                '}';
    }
}
