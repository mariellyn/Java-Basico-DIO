package desafioPOO;

public abstract class Conteudo {

    // Constante estática pública
    public static final double XP_PADRAO = 10d;

    // Campos privados
    private String titulo;
    private String descricao;

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

    // Método abstrato para calcular XP
    public abstract double calcularXp();
}
