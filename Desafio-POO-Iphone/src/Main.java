public class Main {
    public static void main(String[] args) {
        Iphone meuIPhone = new Iphone();

        // Exemplo de uso do Reprodutor Musical
        meuIPhone.selecionarMusica("Nome da música");
        meuIPhone.tocar();
        meuIPhone.pausar();

        // Exemplo de uso do Aparelho Telefônico
        meuIPhone.ligar("123456789");
        meuIPhone.atender();
        meuIPhone.iniciarCorreioVoz();

        // Exemplo de uso do Navegador na Internet
        meuIPhone.exibirPagina("https://www.exemplo.com");
        meuIPhone.adicionarNovaAba();
        meuIPhone.atualizarPagina();
    }
}
