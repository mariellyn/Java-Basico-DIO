import java.util.Scanner;

public class ControleSimplesDeSaques {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double limiteDiario = scanner.nextDouble();
        double saldoDiario = limiteDiario; // Define o saldo diário inicial igual ao limite diário

        // Loop for para iterar sobre os saques
        for (int i = 1; ; i++) {

            double valorSaque = scanner.nextDouble();

            if (valorSaque == 0) {
                System.out.println("Transacoes encerradas.");
                break; // Encerra o loop
            } else if (valorSaque > saldoDiario) {
                System.out.println("Limite diario de saque atingido. Transacoes encerradas.");
                break; // Encerra o loop
            } else {
                saldoDiario -= valorSaque; // Atualiza o saldo diário
                System.out.printf("Saque realizado. Limite restante: %.1f\n", saldoDiario);
            }
        }

        // Fechar o scanner para evitar vazamentos de recursos
        scanner.close();
    }
}
