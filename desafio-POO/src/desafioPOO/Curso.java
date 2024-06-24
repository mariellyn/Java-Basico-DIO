package desafioPOO;


public class Curso {
    // Campos privados
    private String titulo;
    private String descricao;
    private int cargaHoraria;

    // Construtor padrão
    public Curso() {
    }

    // Construtor com parâmetros
    public Curso(String titulo, String descricao, int cargaHoraria) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.cargaHoraria = cargaHoraria;
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

    // Getter para CargaHoraria
    public int getCargaHoraria() {
        return cargaHoraria;
    }

    // Setter para CargaHoraria
    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public String toString() {
        return "Curso{" +
                "titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }
}
