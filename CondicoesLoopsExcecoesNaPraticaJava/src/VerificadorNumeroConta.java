import java.util.Scanner;

public class VerificadorNumeroConta {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            String numeroConta = scanner.nextLine();

            // Chama o método que verifica se o número da conta é válido
            verificarNumeroConta(numeroConta);

            // Se nenhum erro for lançado, imprime a mensagem de sucesso
            System.out.println("Numero de conta valido.");
        } catch (IllegalArgumentException e) {
            // Informa que o número de conta é inválido e exibe a mensagem de erro
            System.out.println("Erro: " + e.getMessage());
        } finally {
            // Fecha o scanner para evitar vazamentos de recursos
            scanner.close();
        }
    }

    private static void verificarNumeroConta(String numeroConta) {
        if (numeroConta.length() != 8) {
            // Lança uma IllegalArgumentException com a mensagem apropriada
            throw new IllegalArgumentException("Numero de conta invalido. Digite exatamente 8 digitos.");
        }
    }
}