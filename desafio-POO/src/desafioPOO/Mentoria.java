package desafioPOO;
import java.time.LocalDate;

public class Mentoria {
    // Campos privados
    private String titulo;
    private String descricao;
    private LocalDate data;

    // Construtor padrão
    public Mentoria() {
    }

    // Construtor com parâmetros
    public Mentoria(String titulo, String descricao, LocalDate data) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.data = data;
    }

    // Getter para Titulo
    public String getTitulo() {
        return titulo;
    }

    // Setter para Titulo
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    // Getter para Descricao
    public String getDescricao() {
        return descricao;
    }

    // Setter para Descricao
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    // Getter para Data
    public LocalDate getData() {
        return data;
    }

    // Setter para Data
    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", data=" + data +
                '}';

    }           
}
