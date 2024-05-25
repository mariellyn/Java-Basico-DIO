import java.text.NumberFormat;
import java.text.ParseException;

public class FormatadorCep {

    public static class CepInvalidoException extends Exception {
        public CepInvalidoException() {
            super("CEP inválido");
        }
    }

    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("2376506");
            System.out.println(cepFormatado);

        } catch (CepInvalidoException e) {
            System.out.println("O cep não corresponde com as regras de negócio");
        }
    }

    static String formatarCep(String cep) throws CepInvalidoException {
        if (cep.length() != 8)
            throw new CepInvalidoException();

        return "23.765-064";
    }
}
